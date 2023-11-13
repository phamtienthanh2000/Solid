import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
//TODO implement builder
// this class is our job , it need to help to create object of UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {

    UserDTO userDTO;

    private String firstName;
    private String lastName;
    private String age;

    private String address;


    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period period = Period.between(date,LocalDate.now());
        this.age= Integer.toString(period.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber()+", "+address.getStreet()+"\n"+address.getCity()
                +"\n"+address.getState()+" "+address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        userDTO= new UserWebDTO(this.firstName+" "+this.lastName,this.address,this.age);
        return userDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return userDTO;
    }
}
