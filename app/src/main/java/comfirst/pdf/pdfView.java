package comfirst.pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfView extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);
        pdfView = (PDFView) findViewById(R.id.pdf);
        pdfView.fromAsset("s-p1-20-q.pdf").load();
        //pdfView.fromSource(pdf, )

     }
}