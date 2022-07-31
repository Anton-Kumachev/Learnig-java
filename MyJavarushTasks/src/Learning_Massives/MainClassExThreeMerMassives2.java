package Learning_Massives;
// Трёхмерные массивы - Многоэтажная парковка

public class MainClassExThreeMerMassives2 {
    public static void main(String[] args) {

        //задаем булев трёхмерный массив. На этой парковке есть 3 этажа, на каждом из которых можно поместить 2х5 = 10 машин. По умолчанию все ячейки пусты (false)
        boolean[][][] parkingLot = new boolean[3][2][5];
//приехало две машины и припарковались на нулевом этаже в ячейке [1][0] и [1][3]
        parkingLot[0][1][0] = true; //Приехала первая машина
        parkingLot[0][1][3] = true; //Приехала вторая машина
        parkingLot[2][1][4] = true; //Приехала третья машина
        parkingLot[1][0][0] = true; //Приехала четвёртая машина
        parkingLot[2][1][4] = true; //Приехала пятая машина

//Выведем массив в консоль
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 5; k++) {
                    if (parkingLot[i][j][k] == true) {
                        System.out.print("ParkingPlace[" + i + "][" + j + "][" + k + "] = " + "CLOSED" + "\t");
                    } else {
                        System.out.print("ParkingPlace[" + i + "][" + j + "][" + k + "] = " + "free" + "\t");
                    }
                }
                System.out.println();
            }
        }
    }
}