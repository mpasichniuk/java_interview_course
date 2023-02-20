class Person {

    private String firstName, lastName, middleName, country, address, phone, gender;
    private int age;

    public Person(String firstName, String lastName, String middleName, int age, String country, String address, String phone, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
    }

    public static Person builder() {
        return new Person();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName ='" + firstName + '\'' +
                ", middleName ='" + middleName + '\'' +
                ", lastName ='" + lastName + '\'' +
                ", age ='" + age + '\'' +
                ", address ='" + address + '\'' +
                ", country ='" + country + '\'' +
                ", phone =" + phone + '\'' +
                ", gender =" + gender +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public Person() {
    }



    public static class PersonBuilder {
        private Person person = new Person();

        public PersonBuilder firstName(String firstName) {
            person.setFirstName(firstName);
            return this;
        }
        public PersonBuilder middleName(String middleName) {
            person.setMiddleName(middleName);
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            person.setLastName(lastName);
            return this;
        }

        public PersonBuilder country (String country) {
            person.setCountry(country);
            return this;
        }

        public PersonBuilder address (String address) {
            person.setAddress(address);
            return this;
        }

        public PersonBuilder age(Integer age) {
            person.setAge(age);
            return this;
        }
        public PersonBuilder phone (String phone) {
            person.setPhone(phone);
            return this;
        }
        public PersonBuilder gender (String gender) {
            person.setGender(gender);
            return this;
        }

        public Person build() {
            return person;
        }
    }
}

