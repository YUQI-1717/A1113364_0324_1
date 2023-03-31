import java.util.*;

class animal{
    String name;
    double height;
    int weight;
    int speed;

    public void show(){
        System.out.println("姓名:"+name);
        System.out.println("身高:"+height+"m");
        System.out.println("體重:"+weight+"kg");
        System.out.println("速度:"+speed+"m/min");
    }

    double distance(int x,double y){
        return x*y*this.speed;
    }
    int distance(int x){
        return x*this.speed;
    }

    public class A1113364_0324_1{
        public static void main (String[] args){

            animal [] animals;
            animals = new animal[4];
            int [] x=new int[4];
            int [] y=new int[4];
            String answer;
            
            for(int i=0;i<animals.length;i++){
                animals[i]=new animal();
            }
            animals[0].name="雪寶";
            animals[0].height=1.1;
            animals[0].weight=52;
            animals[0].speed=100;

            animals[1].name="驢子";
            animals[1].height=1.5;
            animals[1].weight=99;
            animals[1].speed=200;

            animals[2].name="安那";
            animals[2].height=1.7;
            animals[2].weight=48;
            animals[2].speed=120;

            animals[3].name="愛沙";
            animals[3].height=1.7;
            animals[3].weight=50;
            animals[3].speed=120;

            for(int i=0;i<4;i++){
                System.out.println("請輸入"+animals[i].name+"的時間(x):");
                Scanner sc =new Scanner(System.in);
                x[i]=sc.nextInt();
            }
            System.out.println("請問是否輸入加速度(y)?");
            Scanner sc=new Scanner(System.in);
            answer=sc.next();
            int i;

            if(answer=="是"){
                for(i=0;i<4;i++){
                    System.out.println("請輸入"+animals[i].name+"的加速度(y):");
                    Scanner sc1=new Scanner(System.in);
                    y[i]=sc1.nextInt();
                }
                System.out.println(animals[i].name+"奔跑的距離為"+animals[i].distance(x[i],y[i]));
            }else if(answer=="否"){
                for(i=0;i<4;i++){
                    System.out.println(animals[i].name+"奔跑的距離為"+animals[i].distance(x[i]));
                }
            }
            }


            }
        }
    