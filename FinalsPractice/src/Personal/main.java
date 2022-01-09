import javax.swing.*;

public class DeveloperMain {
    public static void main(String[] args) {

        Manager manager = new Manager("Cain Kazimoglu");

        Backend backend = new Backend("muhammad@muhammad.com" , false);
        backend.setName("Muhammad");
        backend.setSurname("Qazi");
        backend.setAge(21);
        backend.setManager(manager);
        int salaryB = backend.calculateSalary(200);
        backend.setSalary(salaryB);
        backend.birthday("Muhammad");
        backend.projectStatus(60);

        Manager manager1 = new Manager("Devrim Seral");

        Frontend frontend = new Frontend("hosam@hosam.com" , false);
        frontend.setSurname("Alhamwi");
        frontend.setName("Hosam");
        frontend.setAge(25);
        frontend.setManager(manager1);
        int salaryF = frontend.calculateSalary(190);
        frontend.setSalary(salaryF);
        frontend.birthday("Hosam");
        frontend.projectStatus(80);


        Developer []developer = {backend,frontend};
        String output = "";
        for(Developer eachDeveloper : developer){
            JOptionPane.showMessageDialog(null,"Name : " + eachDeveloper.getName() + " " + eachDeveloper.getSurname());
            JOptionPane.showMessageDialog(null,"Manager :" + eachDeveloper.managerName());

        }


    }
}
