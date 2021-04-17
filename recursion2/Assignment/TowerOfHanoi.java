package recursion2.Assignment;

import java.util.Scanner;

/*Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move all disks from source rod to destination rod using third rod (say auxiliary). The rules are :
1) Only one disk can be moved at a time.
2) A disk can be moved only if it is on the top of a rod.
3) No disk can be placed on the top of a smaller disk.
Print the steps required to move n disks from source rod to destination rod.
Source Rod is named as 'a', auxiliary rod as 'b' and destination rod as 'c'.*/
public class TowerOfHanoi {

    public static void towerOfHanoi(int numberOfDisks, char sourceTower, char auxiliaryTower, char destinationTower) {
        /*when number of disk is 0 we don't have to do anything, recursion will handle all the cases for us.*/
        if (numberOfDisks == 0) {
            return;
        }
        towerOfHanoi(numberOfDisks - 1, sourceTower, destinationTower, auxiliaryTower);
        System.out.println("Move the Disk no." + numberOfDisks +" from Tower " + sourceTower + " -> Tower " + destinationTower);
        towerOfHanoi(numberOfDisks - 1, auxiliaryTower, destinationTower, sourceTower);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
