
public class Main {
    public static void main(String[] args) {
        // Crear objetos CrewMember
        crewMember member1 = new crewMember(
                "CM001",
                "Carlos Pérez",
                "Engineer",
                "Lieutenant",
                5,
                true
        );

        crewMember member2 = new crewMember(
                "CM002",
                "Laura Gómez",
                "Pilot",
                "Captain",
                10,
                false
        );

        // Imprimir usando toString()
        System.out.println(member1);
        System.out.println(member2);

        // Cambiar estado de servicio
        member2.setOnDuty(true);

        System.out.println("\nDespués de cambiar el estado de Laura:");
        System.out.println(member2);
    }
}
