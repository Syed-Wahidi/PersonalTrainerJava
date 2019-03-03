/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.trainer;
import java.util.Scanner;

/**
 *
 * @author farha
 */
public class PersonalTrainer {

       class Client
        {
            private double Weight =1;
            private double Height=1;
            public void BMI()
            {
             
                double BMI = 2; 

                //Display Chart
                System.out.println("BMI VALUES");
                 System.out.println("Underweight: less than 18.5");
                 System.out.println("Normal:      between 18.5 and 24.9");
                 System.out.println("Overweight:  between 25 and 29.9");
                 System.out.println("Obese:       30 or greater");
                 Scanner keyboard = new Scanner(System.in); 
                do
                {
                     System.out.println("Enter 0 for weight only to exit");
                    // prompt user to enter weight in pounds and read number
                    System.out.println("Enter weight in pounds");
                    Weight =  keyboard.nextDouble();

                    //prompt user to enter height in inches and read number
                    System.out.println("Enter height in inches");
                    Height =  keyboard.nextDouble();

                    //Calculations
                    BMI = (Weight * 703) / (Height * Height);
                    //Display result
                   System.out.printf("BMI = %f ", BMI);
                    if (BMI < 18.5)
                    {
                        System.out.println("Client should gain some wieght");
                    }
                    else if (BMI > 25)
                    {
                        System.out.println("Client should consider losing weight.");
                    }
                    else
                    {
                        System.out.println("Client should maintain weight.");
                    }
                } while (Weight != 0);
               

            }
            public void FFMI()
            {   Scanner keyboard = new Scanner(System.in); 
                double lean = 0;
                double bodyFat = 0;
                double ffmi = 0;
                System.out.println("FFMI VALUES");
                
                String [] values = {"Average: l8-19", "Above Average: 20-21", "Excellent: 22 and over"} ;
                for(int i =0 ; i<values.length; i++)
                {
                    System.out.println(values[i]);
                }
                while (Height != 0)
                {
                    System.out.println("Enter 0 for height to exit");
                    System.out.println("Enter weight in pounds");
                    Weight = keyboard.nextDouble();

                    System.out.println("Enter height in inches");
                    Height = keyboard.nextDouble();

                    System.out.println("Enter body fat % ");
                    bodyFat = keyboard.nextDouble();

                    lean = (Weight * .454) * (1 - (bodyFat / 100));
                    ffmi = (lean / 2.2) / (((Height) * .0254) * ((Height) * .0254)) * 2.20462;
                    System.out.println(ffmi);
                    if(ffmi<18)
                        System.out.println("Consider bodybuilding to gain muscle mass.");
                    else
                    {
                        System.out.println("Consider maintaining.");
                    }


                }
            }
                public void Exercise()
            {
                Scanner keyboard = new Scanner(System.in); 
                System.out.println("Enter 1 for weight loss, Enter 2 for bodybuilding and weight gain, Enter 3 for maintain");
                int exerciseSwitch = keyboard.nextInt() ;
                switch(exerciseSwitch)
                {
                    case 1:
                        System.out.println("30 mins weight training and 30 mins cardio.");
                        break;
                    case 2:
                        System.out.println("40 mins weight training and 20 mins cardio.");
                        break;
                    case 3:
                        System.out.println("30 mins weight training and 20 mins cardio.");
                        break;
                }
            }


            
           

            public Client()
            {
                Weight = 1; 
                Height = 1;
            }
        }

        static void IdealWeight ()
        {
           System.out.println("Ideal Weight for Men and Women");
            System.out.println("Height   Women     Men      BMI 22");
            String[][] arr = new String[][]
            {   {"5'0''","  108 lbs", "  115 lbs", "  114.4 lbs" },
                {"5'1''","  112 lbs", "  119 lbs", "  119 lbs" },
                {"5'2''","  116 lbs", "  123 lbs", "  123 lbs" },
                {"5'3''","  119 lbs", "  127 lbs", "  128 lbs" },
                {"5'4''","  123 lbs", "  131 lbs", "  132 lbs" },
                {"5'5''","  127 lbs", "  136 lbs", "  136 lbs" },
                {"5'6''","  131 lbs", "  140 lbs", "  141 lbs" },
                {"5'7''","  134 lbs", "  144 lbs", "  145 lbs" },
                {"5'8''","  138 lbs", "  148 lbs", "  150 lbs" },
                {"5'10''"," 146 lbs", "  157 lbs", "  158 lbs" },
                {"5'11''"," 149 lbs", "  160 lbs", "  163 lbs" },
                {"6'0''","  153 lbs", "  165 lbs", "  167 lbs" },
                {"6'1''","  157 lbs", "  170 lbs", "  172 lbs" },
                {"6'2''","  160 lbs", "  174 lbs", "  176 lbs" },
                {"6'3''","  164 lbs", "  177 lbs", "  180 lbs" },
                {"6'4''","  168 lbs", "  181 lbs", "  184 lbs" }
            };
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
        }
    public static void main(String[] args) {
            IdealWeight();
            PersonalTrainer pt = new PersonalTrainer();
            PersonalTrainer.Client newClient = pt.new Client(); 
            newClient.BMI();
            newClient.FFMI();
            newClient.Exercise();
    }
    
}
