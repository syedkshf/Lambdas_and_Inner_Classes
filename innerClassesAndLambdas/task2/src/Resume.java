import java.util.ArrayList;
import java.util.List;

public class Resume {
    private Person p;
    private List<Experience> experiences = new ArrayList<>();
    private List<Education> educations = new ArrayList<>();

    public Resume(Person p) {
        this.p = p;
    }

    public class Education {
        String school;
        String major;

        Education(String school, String major) {
            this.school = school;
            this.major = major;
        }

        void setSchool(String school) {
            this.school = school;
        }

        void setMajor(String major) {
            this.major = major;
        }

        String getSchool() {
            return school;
        }

        String getMajor() {
            return major;
        }

        @Override
        public String toString() {
            return major + " at " + school;
        }
    }

    public static class Experience {
        String title;
        int fromYear;
        int toYear;

        Experience(String title, int start_year, int toYear) {
            this.title = title;
            this.fromYear = start_year;
            this.toYear = toYear;
        }

        @Override
        public String toString() {
            return fromYear + " - " + toYear + ":" + title;
        }
    }

    public void addExperience(Experience ex){
        experiences.add(ex);
    }

    public void addEducation(Education ed){
        educations.add(ed);
    }

    @Override
    public String toString(){

        String s = p.toString();
        s+="\nExperience";
        for(Experience ex : experiences)
            s+="\n"+ex;
        s+="\nEducation";
        for(Education ed: educations)
            s+="\n"+ed;
        return s;
    }
};