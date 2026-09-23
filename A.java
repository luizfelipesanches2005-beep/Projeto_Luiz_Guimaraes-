cat << 'EOF' > A.java
public class A {
    private int A1;
    private float A2;

    public int getA1() { return A1; }
    public void setA1(int A1) { this.A1 = A1; }
    public float getA2() { return A2; }
    public void setA2(float A2) { this.A2 = A2; }

    public void MA1() { System.out.println("Método MA1 executado"); }
    public void MA2() { System.out.println("Método MA2 executado"); }
    
    // Novo método solicitado na questão 13
    public void MA3() { 
        System.out.println("Alteração a classe A partir do clone"); 
    }
}
EOF


cat << 'EOF' > C.java
public class C {
    private String C1;
    private int C2;

    // Gets e Sets
    public String getC1() { return C1; }
    public void setC1(String C1) { this.C1 = C1; }
    public int getC2() { return C2; }
    public void setC2(int C2) { this.C2 = C2; }

    // Métodos que imprimem o próprio nome
    public void MC1() { System.out.println("Método MC1 executado"); }
    public void MC2() { System.out.println("Método MC2 executado"); }
}
EOF
