public class Human {
private String name;
private int age;
private String bithplace;



@Override
public String toString() {
    return "Human [name=" + name + ", age=" + age + ", bithplace=" + bithplace + "]";
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public String getBithplace() {
    return bithplace;
}

public void setBithplace(String bithplace) {
    this.bithplace = bithplace;
}

}
