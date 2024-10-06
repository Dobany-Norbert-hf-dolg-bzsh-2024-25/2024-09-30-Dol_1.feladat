/*
* File: Rombatl.java
* Author: Dobány Norbert
* Copyright: 2024, Dobány Norbert
* Group: SZOFT II/1/N
* Date: 2024.10.03
* Github: https://github.com/notdefinitelynot/
* Licenc: GNU GPL
*
* This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU General Public License
* as published by the Free Software Foundation; either version 2
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details:
* http://www.gnu.org/licenses/gpl.html

A program egy rombusz területét számolja ki 
a felhasználó által megadott két átlóból. 
*/
import java.util.Scanner;
public class Rombatl {
    static Scanner sc = new Scanner(System.in);
    public static void solution() {
        System.out.println("A program egy rombusz területét számolja ki a felhasználó által megadott két átlóból.");
        System.out.println("Dobány Norbert, SZOFT II/1/N");
        System.out.print("Adja meg a rombusz \"e\" átlóját: ");
        String eStr = sc.nextLine();
        double e = Double.parseDouble(eStr);
        System.out.print("Adja meg a rombusz \"f\" átlóját: ");
        String fStr = sc.nextLine();
        double f = Double.parseDouble(fStr);
        double area = 0.5 * e * f;
        System.out.println("A rombusz területe: " + area);
    }
}
