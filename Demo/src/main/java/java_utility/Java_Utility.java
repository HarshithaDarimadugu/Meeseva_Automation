package java_utility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * THIS CLASS PROVIDES UTILITIES LIKE 
 * RANDOM PHONE NUMBER 
 * RANDOM EMAIL ID
 * FUTURE DATES
 * PAST DATES
 */

public class Java_Utility {

	/**
	 * This method will generate random phone numbers
	 * 
	 * @return random phone number
	 */

	public static String randomPhoneNumber() {
		Random random = new Random();

		// Generate random area code (100-999)
		int areaCode = 100 + random.nextInt(900);

		// Generate random phone number (1000000-9999999)
		long phoneNumber = 1000000L + random.nextLong(9000000L);

		// Format the phone number
		String randomPhoneNumber = areaCode + "" + phoneNumber;
		if(randomPhoneNumber.charAt(0)>='6')
		{
			return randomPhoneNumber;
		}
		else {
			char first = randomPhoneNumber.charAt(0);
			return randomPhoneNumber.replace(first, '6');
		}
	}

	private static final String[] DOMAINS = {"test.com", "demo.com", "mail.com", "random.com",
			"gmail.com", "yahoo.com" };
	private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static final int USERNAME_LENGTH = 8; // Length of the username part of the email

	/**
	 * This method will give random email address
	 * 
	 * @return Email address
	 */
	public static String randomEmail() {
		Random random = new Random();
		// Generate a random username
		String username = generateRandomString(USERNAME_LENGTH, random);
		// Choose a random domain
		String domain = DOMAINS[random.nextInt(DOMAINS.length)];
		// Combine username and domain to form the email address
		return username + "@" + domain;
	}

	// Helper method to generate a random string of given length
	private static String generateRandomString(int length, Random random) {
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
		}
		return sb.toString();
	}
	
	/**
     * this method Adds a specified number of days to the current date.
     *
     * @param daysToAdd the number of days to add
     * @return the new date after adding the specified days
     */
    public static String addDaysToCurrentDate(int daysToAdd) {
    	 LocalDate currentDate = LocalDate.now();
         LocalDate futureDate = currentDate.plusDays(daysToAdd);
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         return futureDate.format(formatter);
    }
    
    /**
     * this method is used to add past date 
     * 
     * @param days the number of days to subtract
     * @return the past date
     */
    public static String getPastDate(int daysToSubtract) {
    	LocalDate currentDate = LocalDate.now();
        LocalDate pastDate = currentDate.minusDays(daysToSubtract);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return pastDate.format(formatter);
    }
   
    public static String currentDateTime() {
    	  // Define the date and time format in 12-hour format with AM/PM
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        
        // Format the date and time
        return now.format(formatter);
    }
    
    public static String currentDateTime_24() {
  	  // Define the date and time format in 12-hour format with AM/PM
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
      
      // Get the current date and time
      LocalDateTime now = LocalDateTime.now();
      
      // Format the date and time
      return now.format(formatter);
  }

    public static String currentDateTimePlusOneMinute() {
        // Define the date and time format in 12-hour format with AM/PM
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        
        // Get the current date and time and add 1 minute
        LocalDateTime now = LocalDateTime.now().plusMinutes(1);
        
        // Format the date and time
        return now.format(formatter);
    }
    public static String currentDateTimePlusOneMinute_24() {
        // Define the date and time format in 12-hour format with AM/PM
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");//2024-11-25 17:51:04
        
        // Get the current date and time and add 1 minute
        LocalDateTime now = LocalDateTime.now().plusMinutes(1);
        
        // Format the date and time
        return now.format(formatter);
    }
    
//    public static void main(String[] args) {
//		System.out.println(addDaysToCurrentDate(2));
//	}
}
