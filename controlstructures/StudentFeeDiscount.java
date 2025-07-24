package controlstructures;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        String studentName = "SAI NITHIN";
        Byte gradeLevel = 12;
        double totalFee = 100000.00;
        double discount= 0.0;
        boolean academicTopperStatus = true;
        if(gradeLevel <=12 && gradeLevel >=9){
            if(academicTopperStatus){
                discount+=20.0;
                if(gradeLevel ==12){
                    discount+=5.0;
                }else if(gradeLevel == 10){
                    discount+=3.0;
                }

            }else{
                discount+=10.0;
                if(gradeLevel ==12){
                    discount+=5.0;
                }else if(gradeLevel == 10){
                    discount+=3.0;
                }
            }

        }else if(gradeLevel <=8 && gradeLevel>=6){
            discount+=5.0;
        }else{
            System.out.println("invalid grade level given by student "+ studentName);
        }

        double discountAmount = totalFee*discount/100;
        double PayableAmount = totalFee - discountAmount;
        System.out.println("student name  :"+ studentName);
        System.out.println("grade level :"+ gradeLevel);
        System.out.println("total fee :"+ totalFee);
        System.out.println("discount percentage :"+ discount + "%");
        System.out.println("discount amount :"+ discountAmount);
        System.out.println("payable amount :"+ PayableAmount);


    }

}
