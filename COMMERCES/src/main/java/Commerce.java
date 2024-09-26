import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
 class Commerce {
    private  String Id;
    private String name;
    private String Address;
    private String phoneNumber;

    @Override
    public String toString() {
        return "Commerce{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
