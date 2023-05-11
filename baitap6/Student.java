package baitap6;

public class Student {
    int code,toan,li,hoa;
    String name;
    public Student(){

    }
    public Student(int code, String name, int toan, int hoa, int li) {
        this.code = code;
        this.name = name;
        this.toan = toan;
        this.hoa = hoa;
        this.li = li;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getToan() {
        return toan;
    }

    public void setToan(int toan) {
        this.toan = toan;
    }

    public int getLi() {
        return li;
    }

    public void setLi(int li) {
        this.li = li;
    }

    public int getHoa() {
        return hoa;
    }

    public void setHoa(int hoa) {
        this.hoa = hoa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                " code = " + code +
                " toan = " + toan +
                " li =  " + li +
                " hoa = " + hoa +
                " name = " + name ;
    }
}
