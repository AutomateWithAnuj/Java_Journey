package Java_Programs._38_Threading.Finalize;

import java.io.File;
import java.lang.ref.Cleaner;

public class P238_Finalize {
    private static final Cleaner cleaner = Cleaner.create();

    private final File file;
    private final Cleaner.Cleanable cleanable;

    public P238_Finalize(String filePath) {
        this.file = new File(filePath);
        this.cleanable = cleaner.register(this, new FileCleanup(file));
    }

    private static class FileCleanup implements Runnable {
        private final File fileToDelete;

        FileCleanup(File file) {
            this.fileToDelete = file;
        }

        @Override
        public void run() {
            if (fileToDelete.exists()) {
                if (fileToDelete.delete()) {
                    System.out.println("File deleted using Cleaner: " + fileToDelete.getName());
                } else {
                    System.out.println("Failed to delete file using Cleaner: " + fileToDelete.getName());
                }
            }
        }
    }
}
