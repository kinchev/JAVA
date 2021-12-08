public class Employee extends BaseUser{
    @Override
    public String getDisplayName() {
        return String.format("%s,Email: %s",this.getUsername(),this.getEmail());
    }
}
