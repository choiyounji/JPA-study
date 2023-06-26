package efub.study.jpa;

import javax.persistence.*;
@Entity
@Table(name="MEMBER")
public class Member {
    @Id
    @Column(name="ID")
    private String id;
    @Column(name="NAME")
    private String username;
    private Integer age;

    //Getter,Setter
    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public String getUsername(){return username;}
    public void setUsername(String username){this.username=username;}

    public Integer getAge(){return age;}
    public void setAge(Integer age){this.age=age;}
}
