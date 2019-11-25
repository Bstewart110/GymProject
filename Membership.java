package GroupProject;

abstract public class Membership {

    //instance variables
    private String type;  //student or adult membership
    private String name;
    private String DOB;
    private String address;
    private String email;
    private double cost;

    public Membership () {
    }//default constructor

    public Membership(String mType, String mName, String mDOB, String mAddress, String mEmail, double mCost){
        type = mType;
        name = mName;
        DOB = mDOB;
        address = mAddress;
        email = mEmail;
        cost = mCost;
    }//alternate constructor


    //set and Get methods
    protected void setType(String mType){
        type = mType;
    }//setType

    protected String getType(){
        return type;
    }//getType

    protected void setName(String mName) {
        name = mName;
    }//setName

    protected String getName(){
        return name;
    }//getName

    protected void setDOB(String mDOB) {
        DOB = mDOB;
    }//setDOB

    protected String getDOB () {
        return DOB;
    }//getDOB

    protected void setAddress(String mAddress){
        address = mAddress;
    }//setAddress

    protected String getAddress(){
        return address;
    }//getAddress

    protected void setEmail(String mEmail){
        email = mEmail;
    }//setEmail

    protected String getEmail(){
        return email;
    }//getEmail

    protected void setCost(double mCost){
        cost = mCost;
    }//setCost

    protected double getCost(){
        return cost;
    }//getCost

    //Abstract method to be defined in Subclasses
    abstract protected String getStatus();

    public String toString() {
        return ("Name: \t\t" + name);
    }//toString



}//class
