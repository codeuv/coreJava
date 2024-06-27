public class T1_single {
    static class Book {
        String book_id = "None";
        String author_id = "None";
        String book_name = "";

        public Book(String book_id, String author_id, String book_name) {
            this.book_id = book_id;
            this.author_id = author_id;
            this.book_name = book_name;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "book_id='" + book_id + '\'' +
                    ", author_id='" + author_id + '\'' +
                    ", book_name='" + book_name + '\'' +
                    '}';
        }
    }

    static class Ebook extends Book {
        String webStore = "None";

        public Ebook(String book_id, String author_id, String book_name, String webStore) {
            super(book_id, author_id, book_name);
            this.webStore = webStore;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
