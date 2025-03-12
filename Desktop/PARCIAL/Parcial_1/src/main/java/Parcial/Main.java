
package Parcial;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();
        List<Empresa> empresas = new ArrayList<>();
        List<OfertaEmpleo> ofertas = new ArrayList<>();

        while (true) {
            String[] opciones = {"Registrar Candidato", "Registrar Empresa", "Publicar Oferta", "Ver Candidatos", "Ver Ofertas", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opcion:", "Sistema de Busqueda de Empleo",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    String nombreCandidato = JOptionPane.showInputDialog("Ingrese nombre del candidato:");
                    String direccionCandidato = JOptionPane.showInputDialog("Ingrese direccion del candidato:");
                    String telefonoCandidato = JOptionPane.showInputDialog("Ingrese telefono del candidato:");
                    String emailCandidato = JOptionPane.showInputDialog("Ingrese email del candidato:");
                    candidatos.add(new Candidato(nombreCandidato, direccionCandidato, telefonoCandidato, emailCandidato));
                    JOptionPane.showMessageDialog(null, "Candidato registrado con exito.");
                    break;
                case 1:
                    String nombreEmpresa = JOptionPane.showInputDialog("Ingrese nombre de la empresa:");
                    String direccionEmpresa = JOptionPane.showInputDialog("Ingrese direccion de la empresa:");
                    empresas.add(new Empresa(nombreEmpresa, direccionEmpresa));
                    JOptionPane.showMessageDialog(null, "Empresa registrada con exito.");
                    break;
                case 2:
                    if (empresas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Debe registrar al menos una empresa primero.");
                        break;
                    }
                    String descripcion = JOptionPane.showInputDialog("Ingrese descripcion del empleo:");
                    String ubicacion = JOptionPane.showInputDialog("Ingrese ubicacion del empleo:");
                    int salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese salario ofrecido:"));
                    String[] nombresEmpresas = empresas.stream().map(Empresa::getNombre).toArray(String[]::new);
                    String seleccionEmpresa = (String) JOptionPane.showInputDialog(null, "Seleccione una empresa:",
                            "Publicar Oferta", JOptionPane.QUESTION_MESSAGE, null, nombresEmpresas, nombresEmpresas[0]);
                    Empresa empresaSeleccionada = empresas.stream().filter(e -> e.getNombre().equals(seleccionEmpresa)).findFirst().orElse(null);
                    if (empresaSeleccionada != null) {
                        ofertas.add(new OfertaEmpleo(descripcion, ubicacion, salario, empresaSeleccionada));
                        JOptionPane.showMessageDialog(null, "Oferta publicada con exito.");
                    }
                    break;
                case 3:
                    if (candidatos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay candidatos registrados.");
                    } else {
                        StringBuilder listaCandidatos = new StringBuilder("Candidatos Registrados:\n");
                        for (Candidato c : candidatos) {
                            listaCandidatos.append(c.getInformacionContacto()).append("\n\n");
                        }
                        JOptionPane.showMessageDialog(null, listaCandidatos.toString());
                    }
                    break;
                case 4:
                    if (ofertas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay ofertas publicadas.");
                    } else {
                        StringBuilder listaOfertas = new StringBuilder("Ofertas de Empleo:\n");
                        for (OfertaEmpleo o : ofertas) {
                            listaOfertas.append(o.getDetalles()).append("\n\n");
                        }
                        JOptionPane.showMessageDialog(null, listaOfertas.toString());
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
