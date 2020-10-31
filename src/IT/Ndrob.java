package IT;

public class Ndrob {
    static int koeff = 2;//Поле видят все обьекты , но обьект не может обратьтся , можно братиться к классу
    private int num ; // числитель
    private int denom;//знаменатель

    //служебные методы ( сеттеры , геттеры , констуркторы и прочие )




    // констурктор по умолчанию всегда паблик констурторы
    public Ndrob(){
        num = 1;
        denom =1;
    }


    // конструктор с параметрами
    public Ndrob(int num, int denom) {
        this.num = num;
        if(denom!=0)
            this.denom = denom;
        else
            this.denom = 1;
    }
    // Констуртор копирования
    public  Ndrob(Ndrob drobForCopy){
        num = drobForCopy.num;
        denom =drobForCopy.denom;
    }

    //сеттеры код генерйте метод

    public void setNum(int num) {
        this.num = num;
    }

    public void setDenom(int denom) {
        if (denom!=0)
            this.denom = denom;
        else
            this.denom=1;
    }

    public static int getNum() {
        return koeff;
    }

    public int getDenom() {
        return denom;
    }

    //вычислительные ( методы обработки класса)
    public Ndrob milti (Ndrob secondmn){
        Ndrob rez = new Ndrob();
        rez.num = this.num * secondmn.num;
        rez.denom= this.denom * secondmn.denom;
        return rez;


    }

    // деление
    public Ndrob del (Ndrob seconddel){
        Ndrob rez1 =new Ndrob();
        rez1.num= this.num * seconddel.denom;
        rez1.denom = this.denom* seconddel.num;
        return rez1;
    }

    //Сложение

    public Ndrob summa (Ndrob secondsum){
        Ndrob sum1 = new Ndrob();
        if (this.denom == secondsum.denom ) {
            sum1.num= this.num + secondsum.num;
            sum1.denom = this.denom;

        }
        else{
            sum1.num= this.num * secondsum.denom + secondsum.num * this.denom;
            sum1.denom = this.denom * secondsum.denom;
        }
        return sum1;
    }
    // Вычетание
    public Ndrob razn (Ndrob secondsum){
        Ndrob sum2 = new Ndrob();
        int a = 0;
        if (this.denom == secondsum.denom ) {
            sum2.num= this.num - secondsum.num;
            sum2.denom = this.denom;
            while(sum2.num % sum2.denom !=0){
                a = sum2.num % sum2.denom;


            }

        }
        else{
            sum2.num= this.num * secondsum.denom - secondsum.num * this.denom;
            sum2.denom = this.denom * secondsum.denom;
        }
        return sum2;
    }
    // Сокращение дроби



    //поддержка ( обеспечивающие красивую печать )
    public void print(){
        System.out.println(num + "/"+ denom);

    }

    @Override
    public String toString() {
        return num + "/"+ denom+ "\n koeff="+ koeff;
    }
}
