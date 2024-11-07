package main.java.org.hogwarts;

public class Student implements Comparable<Student>  {
    private String name;
    private String faculty;
    private int age;
    private String[] specialSkills = new String[3];

    public Student(String name, String faculty, int age) {
        this.name = name;
        this.faculty = faculty;
        this.age = age;
        this.specialSkills = new String[3];
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getAge() {
        return age;
    }

    public String[] getSpecialSkills() {
        return specialSkills;
    }

    public void castSpell(Spell spell) {
        if (this.age < 11 && spell.getPower() > 1) {
            throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
        } else if (this.age < 12 && spell.getPower() > 2) {
            throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
        } else if (this.age < 13 && spell.getPower() > 3) {
            throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
        } else if (this.age < 14 && spell.getPower() > 4) {
            throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
        } else if (this.age < 15 && spell.getPower() > 5) {
            throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
        } else if (this.age < 16 && spell.getPower() > 6) {
            throw new SpellCastException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
        }

        // If none of the above conditions threw an exception, the student can cast the spell
        System.out.println(this.name + " used " + spell.getTitle());
    }

    @Override
    public int compareTo(Student o) {
        return this.age;
    }
}

