package neon;

public class Exercise {
	/* Tìm giá trị lớn nhất của hai số nguyên */
    public static int max(int x, int y) {
        return (x >= y) ? x : y;
    }

    /* Tìm giá trị lớn nhất của mảng số nguyên */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = (arr[i] < min) ? arr[i] : min;
        }
        return min;
    }

    /* Tính chỉ số BMI */
    public static String BMI (double weight, double height) {
        // Cân nặng: weight (kg)
        // Chiều cao: height (m)
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi < 23) {
            return "Bình thường";
        } else if (bmi < 25) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }

}
