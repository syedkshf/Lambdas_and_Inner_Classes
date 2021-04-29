public class Task {
    public static void main(String[] args) {
        Person p = new Person("Kim Possible", "2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);
        Resume.Education ed = r.new Education("NEIU", "Computer Science");
        r.addEducation(ed);
        Resume.Experience ex = new Resume.Experience("Labourer", 2017, 2018);
        r.addExperience(ex);
        r.addExperience(new Resume.Experience("Foreman", 2018, 2020));
        r.addExperience(new Resume.Experience("Engineer", 2020, 2021));
        System.out.println(r); //watch the resume print.
    }
}