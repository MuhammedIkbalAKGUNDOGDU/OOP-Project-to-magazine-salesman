package nypDonemProjesi;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Vector;
public class Distributor implements Serializable  {
	 /**
	 * 
	 */
	static Hashtable<String,Journal> journals = new Hashtable<>();
	static Vector<Subscriber> subscribers = new Vector<>();
	 
	 public boolean addJournal(Journal journal) {
		 if(searchJournal(journal.getIssn()) == null)
		 {
			 System.out.println("Journal put journals succesfully");
			 journals.put(journal.getIssn(), journal);
			 return true;
		 }
		 else {
			 System.out.println("You already have one journal with this issn");
			 return false;
		 }
		 
	 }
	 
	 public Journal searchJournal(String issn) {
		 Journal foundJournal = journals.get(issn); 

	        if (foundJournal != null) {
	            System.out.println("Journal found: " + foundJournal.getName());
	            return foundJournal;
	        } else {
	            System.out.println("Journal not found for ISSN: " + issn);
	            return null;
	        }
	 }
	  
	 public boolean addSubscriber(Subscriber subscriber) {
		 if(searchSubscriber(subscriber.getName()) == null)
		 {
			 System.out.println("Subscriber put Subscribers succesfully");
			 subscribers.add(subscriber);
			 return true;
		 }
		 else {
			 System.out.println("You already have one Subscriber with same infos");
			 return false;
		 }
	 }
	 
	 public Subscriber searchSubscriber(String name) {
		 for (Subscriber subscriber : subscribers) {
	            if (subscriber.getName().equalsIgnoreCase(name)) {
	                System.out.println("Subscriber found: " + subscriber.getName());
	                return subscriber;
	            }  
	        }
		 

	        System.out.println("Subscriber not found for name: " + name);
	        return null;
	 }
	 
	 public boolean addSubscription(String issn, Subscriber subscriber, Subscription subscription) {
		    Journal foundedJournal = searchJournal(issn);
		    Subscriber foundedSubscriber = searchSubscriber(subscriber.getName());

		    if (foundedJournal != null && foundedSubscriber != null) {
		        if (foundedJournal.subscriptions.contains(subscription)) {
		            System.out.println("You already have this subscription; your copy count has increased.");
		            int index = foundedJournal.subscriptions.indexOf(subscription);
		            if (index != -1) {
		                foundedJournal.subscriptions.get(index).setCopies(subscription.getCopies());
		            }
		            return true;
		        } else {
		            System.out.println("Subscription added successfully");
		            foundedJournal.addSubscription(subscription);
		            return true;
		        }
		    } else {
		        System.out.println("Subscription cannot be added");
		        return false;
		    }
		}
	 
	 public void listSubscriptionsByIssn(String issn) {
	        Journal foundJournal = journals.get(issn);

	        if (foundJournal != null) {
	            if (!foundJournal.subscriptions.isEmpty()) {
	                System.out.println("Subscriptions for Journal with ISSN " + issn + ":");
	                for (Subscription subscription : foundJournal.subscriptions) {
	                    System.out.println(subscription);
	                }
	            } else {
	                System.out.println("No subscriptions found for the specified journal.");
	            }
	        } else {
	            System.out.println("Journal not found.");
	        }
	    } 
	 
	 public void listSubscriptionsByName(String subscriberName) {
		int i=0;
	       for(Journal journal : journals.values()) {
	    	   for(Subscription subscription : journal.subscriptions)
	    	   {
	    		   if(subscription.subscriber.getName().equals(subscriberName)) {
	    			    System.out.println(subscription);
	    			    i++;
	    		   }
	    	   }
	       	}
	       if(i==0) {
	    	   System.out.println("not found");
	       }
	 	}
	 
	 public void listAllSendingOrders(int month,int year) {
		 int tempfrequeny ;;
		 DateInfo month1;
		 for(Journal journal : journals.values()) {
	    	   for(Subscription subscription : journal.subscriptions)
	    	   {
	    		  tempfrequeny=0;
	    		  month1 =  subscription.dates.copy();
	    		  int frequency = subscription.journal.getFrequency();
	    		  if(month1.starthMonth<month1.endMonth) {
	    			  tempfrequeny=0;
	    			  while(month1.starthMonth<=12)
	    			  { 
	    				  if(month1.starthMonth==month && month1.startYear == year) {
	    					  if(subscription.canSend(tempfrequeny)) {
	    						  System.out.println(subscription.subscriber.getName()+" "+month1);
	    					  }
	    				  }
	    				  tempfrequeny += frequency;
	    				  month1.starthMonth += frequency;
	    			  }
	    		  }else {
	    			  while(tempfrequeny<=12)
	    			  {  
	    				  if(month1.starthMonth==month && month1.startYear == year) {
	    					  if(subscription.canSend(tempfrequeny)) {
	    						  System.out.println(subscription.subscriber.getName()+" "+month1);
	    					  }
	    				  }
	    				  if(month1.starthMonth+frequency <=12) {
	    					  tempfrequeny += frequency;
		    				  month1.starthMonth += frequency;
	    				  }else {
	    					  tempfrequeny += frequency;
	    					  month1.startYear ++;
	    					  month1.starthMonth = month1.starthMonth+frequency-12;
	    				  }
	    			  }
	    		  }
	    		  
	    		  
	    	   }
	       	}
	 }
	 
	 public void listSendingOrders(String issn,int month,int year) {
		 int tempfrequeny;
		 DateInfo month1;
		 for(Journal journal : journals.values()) {
	    	   for(Subscription subscription : journal.subscriptions)
	    	   {
	    		  tempfrequeny=0; 
	    		  month1 =  subscription.dates.copy();
	    		  int frequency = subscription.journal.getFrequency();
	    		  if(month1.starthMonth<month1.endMonth) {
	    			  while(month1.starthMonth<=12)
	    			  {  
	    				  if(month1.starthMonth==month && month1.startYear == year) {
	    					  if(subscription.canSend(tempfrequeny)&&subscription.journal.getIssn().equals(issn)) {
	    						  System.out.println(subscription.subscriber.getName()+" "+month1+" "+subscription.journal.getIssn());
	    					  }
	    				  }
	    				  tempfrequeny += frequency;
	    				  month1.starthMonth += frequency;
	    			  }
	    		  }else {
	    			  while(tempfrequeny<=12)
	    			  {  
	    				  
	    				  if(month1.starthMonth==month && month1.startYear == year) {
	    					  if(subscription.canSend(tempfrequeny)&&subscription.journal.getIssn().equals(issn)) {
	  
	    						  System.out.println(subscription.subscriber.getName()+" "+month1+" "+subscription.journal.getIssn());
	    					  }
	    				  }
	    				  if(month1.starthMonth+frequency <=12) {
	    					  tempfrequeny += frequency;
		    				  month1.starthMonth += frequency;
	    				  }else {
	    					  tempfrequeny += frequency;
	    					  month1.startYear ++;
	    					  month1.starthMonth = month1.starthMonth+frequency-12;
	    				  }
	    			  }
	    		  }
	    		  
	    		  
	    	   }
	       	}
	 }
	 
	 public void listInCompletePayments() {
		 DateInfo month ;
		 int monthcount,frequency;
		 for(Journal journal2 : journals.values()) {
	    	   for(Subscription subscription : journal2.subscriptions)
	    	   {
	    		month = subscription.dates.copy();
	    		System.out.println(month);
	    		frequency = subscription.journal.getFrequency();
	    		if(month.starthMonth<month.endMonth) {
	    			monthcount = ((month.endMonth - month.starthMonth ));
	    			if(subscription.canSend(monthcount)) {
	    				System.out.println("Incomplete Payment for " + subscription.subscriber.getName() +
	                            " - Journal: " + subscription.journal.getName() +
	                            " - Expected Payment: " + monthcount/frequency * subscription.journal.getIssuePrice() +
	                            " - Received Payment: " + subscription.getPayment());
	    			}else {
	    				System.out.println("Not ncomplete Payment for " + subscription.subscriber.getName() +
	                            " - Journal: " + subscription.journal.getName() +
	                            " - Expected Payment: " + monthcount/frequency  * subscription.journal.getIssuePrice() +
	                            " - Received Payment: " + subscription.getPayment());
	    			}
	    		}else {
	    			monthcount = (12-(month.starthMonth - month.endMonth));
	    			if(subscription.canSend(monthcount)) {
	    				System.out.println("Incomplete Payment for " + subscription.subscriber.getName() +
	                            " - Journal: " + subscription.journal.getName() +
	                            " - Expected Payment: " + monthcount/frequency * subscription.journal.getIssuePrice() +
	                            " - Received Payment: " + subscription.getPayment());
	    			}else {
	    				System.out.println("Not ncomplete Payment for " + subscription.subscriber.getName() +
	                            " - Journal: " + subscription.journal.getName() +
	                            " - Expected Payment: " + monthcount/frequency  * subscription.journal.getIssuePrice() +
	                            " - Received Payment: " + subscription.getPayment());
	    			}
	    		}
	    	   }
	       	}
	 }
	 
	 public static void saveState() {
		 	serializeObjects(journals, "hashMap.ser");
	        serializeObjects(subscribers, "vector.ser");
	    }
	
	 public void loadState() {
		 journals = deserializeObject("hashMap.ser");
		 subscribers = deserializeObject("vector.ser");
		 	System.out.println("Deserialized HashMap: " + journals);
	        System.out.println("Deserialized Vector: " + subscribers);
	    }
	 
	 public void report() {
		 
	 }  
	 
	 public static <T extends Serializable> void serializeObjects(T object, String fileName) {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
	            oos.writeObject(object);
	            System.out.println("Object serialized successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 public static <T extends Serializable> T deserializeObject(String fileName) {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
	            return (T) ois.readObject();
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	 
}
