package tugas;

public class Film {
    private String judul;
    private int minUsiaPenonton;

    Film(String judul, int minUsiaPenonton) {
        this.judul = judul;
        this.minUsiaPenonton = minUsiaPenonton;
    }

    public String getJudul() {
        return judul;
    }

    public int getMinUsiaPenonton() {
        return minUsiaPenonton;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setMinUsiaPenonton(int minUsiaPenonton) {
        this.minUsiaPenonton = minUsiaPenonton;
    }

    public void info() {
        System.out.println("Judul film: " + judul + "\nUsia minimal penonton: " + minUsiaPenonton);
    }
}
