import java.sql.SQLOutput;

public class LandLine implements Phone
{
   private String myPhoneNo;
   private boolean isRinging;
   private boolean isPowerOn;

    public LandLine(String myPhoneNo)
    {
        this.myPhoneNo = myPhoneNo;
        isRinging=false;
        isPowerOn=true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public boolean powerOn() {
        this.isPowerOn = true;
        return true;
    }

    @Override
    public void callNumber(String phoneNo) {
      if(isPowerOn == true)
      {
          System.out.println("Enter the required no"+phoneNo);
      }
      else
      {
          System.out.println("Your Landline is Off");
      }
    }

    @Override
    public void receiveNumber(String phoneNo)
    {
        if(isPowerOn && myPhoneNo.equals(phoneNo))
        {
           isRinging=true;
            System.out.println("Hey :" +myPhoneNo+ " Receiving Phone No");
        }
        else
        {
            System.out.println("Call Not recieved");
        }
        return;

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public boolean answerCall() {
        if(isRinging == true)
        {
            System.out.println("Call answered");
            this.isRinging=false;
            return true;
        }
        return false;
    }
}
