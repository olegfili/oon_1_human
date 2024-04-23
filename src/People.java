public class People {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;
    public People (String name, int yearOfBirth, String town, String jobTitle) {
        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }

        if (town == null || town.isEmpty()){
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

        if (jobTitle == null || jobTitle.isEmpty()){
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }
    public String toString () {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}

