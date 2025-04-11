package Learning;
public class Primitivetypes {
	public static void main(String[] args) {
		//byte
		//Overflow Explanation: Exceeds the range of byte data type
		byte overflow = (byte)(127 + 10); // 127 + 1 = 128, but byte max value is 127
        System.out.println("Overflow result: " + overflow);
        
        //Underflow Explanation:Less the range of byte data type
        byte underflow = (byte)(-128-10);
        System.out.println("Underflow result:" + underflow);
        
        //short
        short shortMaxvalue = 32767;
        short shortMinvalue = -32768;
        short tc = (short) (shortMaxvalue+1);
        System.out.println("Maximum short value: " + shortMaxvalue);
        System.out.println("Minimum short value: " + shortMinvalue);
        //byte tc = (byte)shortMinvalue;
        System.out.println(tc);
     
        //long data type
        int lightspeed;
        long days;
        long seconds;
        long distance;
        
        lightspeed = 186000;
        days = 1000L;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print("In " + days);
        System.out.print("days light will travel about");
        System.out.println(distance + "miles");
        
        //float data type
        float number = 5.6789179f;
        System.out.println("Float number is: " + number);
        
        //boolean data type
        boolean b;
        b = false;
        System.out.println("b is" +" "+ b);
        b = true;
        System.out.println("b is" +" "+ b);
        if(b) System.out.println("This is executed");
        b = false;
        if(b) System.out.println("This is not executed");
        System.out.println("10 > 9 is" + (10>9));
        
        boolean isRainy = true;
        if(isRainy) System.out.println("Take umberlla");
        else System.out.println("Enjoy the sunshine");
	
        boolean keepRunning = true;
        int count = 0;
        while(keepRunning) {
        	System.out.println("Loop iteration:"+" "+ count);
        	count++;
        	if(count ==5)
        		keepRunning=false;
        }
        }
	}
