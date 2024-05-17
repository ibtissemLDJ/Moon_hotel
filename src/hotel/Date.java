package hotel;

public class Date {
	protected  int day ;
	protected int month ;
	protected int  year ;
	public Date ( int day , int month ,int year )throws IllegalArgumentException{
	    if (!isValidDate(day,month,year)) throw new IllegalArgumentException("this date is not valid.");
	    this.day = day ;
	    this.month= month ; 
	    this.year = year ;
	}
	public boolean isValidDate(int day , int month , int year ){
	    if (month<1 || year<1900 ||day<1 ||month>12||day >31) return false;
	    
	    int maxDays = 31;
	    if (month == 4 || month == 6 || month == 9 || month == 11) {
	        maxDays = 30;
	    } else if (month == 2) {
	        maxDays = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
	    }
	    return day <= maxDays;
	}
	public int getDay() {
	    return day;
	}
	public int getMonth() {
	    return month;
	}
	public int getYear() {
	    return year;
	}
	public void setDay(int day) {
	    if (isValidDate(day, this.month, this.year)){
	        this.day= day;
	    }else{
	        throw new IllegalArgumentException("YOU PROVIDED AN INVALIDE DAY");
	    }
	}
	public void setMonth(int month) {
	    if (isValidDate(this.day, month, this.year)){
	        this.month= month;
	    }else{
	        throw new IllegalArgumentException("YOU PROVIDED AN INVALIDE MONTH");
	    }
	}
	public void setYear(int year) {
	    if (isValidDate(this.day, this.month,year)){
	        this.year=year;
	    }else{
	        throw new IllegalArgumentException("YOU PROVIDED AN INVALIDE YEAR");
	    }
	}
	public String toString() {
	    return String.format("%02d/%02d/%04d", day, month, year);
	}
	public int numberOfDaysInMonth(int month){
	    if (month<1 || month>12) return 0;
	    
	    int maxDays = 31;
	    if (month == 4 || month == 6 || month == 9 || month == 11) {
	        maxDays = 30;
	    } else if (month == 2) {
	        maxDays = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
	    }
	    return maxDays;
	}
	public int toNumberOfNights(Date debut, Date fin ){
	    if (isValidDate(debut.day, debut.month, debut.year)&& isValidDate(fin.day, fin.month, fin.year)){
	        if (debut.month== fin.month){
	            return fin.day -debut.day;
	        }else if (debut.month<fin.month){
	           return debut.numberOfDaysInMonth(debut.month) - debut.day + fin.day;
	        }else{
	              return 0;}
	    }else return 0;
	}
/*	public  int compareDate(Date date1, Date date2) {
	    if (date1.year < date2.year) {
	        return 1;
	    } else if (date1.year > date2.year) {
	        return -1;
	    } else if (date1.month < date2.month) {
	        return 1;
	    } else if (date1.month > date2.month) {
	        return -1;
	    } else if (date1.day < date2.day) {
	        return 1;
	    } else if (date1.day > date2.day) {
	        return -1;
	    } else {
	        return 0;
	    }
	}
*/
	public int compareDate (Date date1 , Date date2) {
	      if ((date1.year) < (date2.year)) {
	        return 1;
	      } else if ((date1.year) > (date2.year) ) {
	        return -1 ;
	      }else if ((date1.year) == (date2.year)) {
	          if ((date1.month) < (date2.month)) {
	            return 1 ;
	          }else if  ((date1.month) > (date2.month)) {
	            return -1;
	          } else if ((date1.month) == (date2.month)) {
	            if ((date1.day) < (date2.day)) {
	              return 1 ;
	            }else if  ((date1.day) > (date2.day)) {
	              return -1;
	            } else if ((date1.day) == (date2.day)) {
	            return 0 ;}
	          }
	      }
	      return -3;
	  }
}
