package kelompok;
import javax.swing.*;
public class main_page {
    public static String menu,ts,inp,ket_ju,pj,ket_pj,pb,ket_pb,cb,ket_cb,sm,ket_sm,sp,ket_sp,ed,pil,rekap,hp;
    public static int j,jml_j=0,jml_pj=0,jml_pb=0,jml_cb=0,jml_sm=0,c,pl,jml_email,jml_noemail,jml_nohp=0,jml_no_nohp=0,z,h,d,x1,x2,sisa;
    public static double m;
    public static void main(String[] args){
        //array        
        String nama_toko[] = null;
        nama_toko = new String[17];
        
        String alamat[];
        alamat = new String[17];
        
        String nama_pemilik[];
        nama_pemilik = new String[17];
        
        String jenis_usaha[];
        jenis_usaha = new String[17];
        
        double modal[];
        modal = new double[17];
        
        String penjualan[];
        penjualan = new String[17];
        
        String pembeli[];
        pembeli = new String[17];
        
        String cabang[];
        cabang = new String[17];
        
        String alamat_email[];
        alamat_email = new String[17];
        
        String sosial_media[];
        sosial_media = new String[17];
        
        String no_hp[];
        no_hp = new String[17];
        
        String status_pemilik[];
        status_pemilik = new String[17];
        
        int x = -1, no = 0;
        boolean exit_input = true,salah_modal = true,putar_ju = true,putar_sm = true,putar_t = true;
        String info ="";
        
        //menu
        do
        {
            menu = JOptionPane.showInputDialog("    MENU SISTEM PEDAGANG \n"
                    + "         KOTA PEKALONGAN \n"
                    + "             DAN SEKITARNYA \n"
                    + "1. INPUT DATA PEDAGANG \n"
                    + "2. EDIT DATA PEDAGANG\n"
                    + "3. HAPUS DATA PEDAGANG\n"
                    + "4. LAPORAN DATA PEDAGANG\n"
                    + "5. LAPORAN STATISTIK\n"
                    + "6. LAPORAN ALAMAT USAHA\n"
                    + "7. LAPORAN MAHASISWA\n"
                    + "8. EXIT\n"
                    + "9. testing data array\n"
                    + "   PILIH [1-8]");
            
            switch(menu){
            //bagian input data                
                case "1":
                {
                    int nmr = 0;
                    ts =  JOptionPane.showInputDialog("TANGGAL SURVEI ");
                    do
                    {
                        if(x==17){
                            JOptionPane.showMessageDialog(null,"Data Sudah Penuh");
                        }else{
                            inp = "y";
                            while("y".equals(inp) || "Y".equals(inp))
                            {
                                inp = JOptionPane.showInputDialog("INPUT DATA [Y/T] ");
                                if(x==16){
                                    JOptionPane.showMessageDialog(null, "Data Sudah Penuh");
                                    inp = "T";
                                }
                                if("y".equals(inp) || "Y".equals(inp))
                                {
                                    no = no + 1;
                                    x = x + 1;
                                    nmr = nmr + 1;
                                    
                                    JOptionPane.showMessageDialog(null,"DATA = "+nmr);
                                    
                                    String nt = JOptionPane.showInputDialog("NAMA TOKO");
                                    nama_toko[x]= nt;
                                    
                                    String almt = JOptionPane.showInputDialog("ALAMAT");
                                    alamat[x]= almt;
                                    
                                    String np = JOptionPane.showInputDialog("NAMA PEMILIK");
                                    nama_pemilik[x]= np;
                                    
                                    do
                                    {
                                        try
                                        {
                                            do
                                            {
                                                String ju = JOptionPane.showInputDialog("JENIS USAHA \n"
                                                    + "1. PAKAIAN \n"
                                                    + "2. SARUNG \n"
                                                    + "3. MAKANAN/MINUMAN \n"
                                                    + "4. SEPATU/TAS \n"
                                                    + "5. ELEKTRONIK \n"
                                                    + "6. BARANG BEKAS \n"
                                                    + "7. LAIN-LAIN");
                                                j = Integer.parseInt(ju);
                                            }
                                            while(!(j>=1 && j<=7));
                                            if(j==1){
                                                ket_ju = "PAKAIAN";
                                                jml_j = jml_j + 1;
                                            }else if(j==2){
                                                ket_ju = "SARUNG";
                                                jml_j = jml_j + 1;
                                            }else if(j==3){
                                                ket_ju = "MAKANAN/MINUMAN";
                                                jml_j = jml_j + 1;
                                            }else if(j==4){
                                                ket_ju = "SAPATU/TAS";
                                                jml_j = jml_j + 1;
                                            }else if(j==5){
                                                ket_ju = "ELEKTRONIK";
                                                jml_j = jml_j + 1;
                                            }else if(j==6){
                                                ket_ju = "BARANG BEKAS";
                                                jml_j = jml_j + 1;
                                            }else{
                                                ket_ju = "LAIN - LAIN";
                                                jml_j = jml_j + 1;
                                            }
                                            putar_ju = false;
                                        }
                                        catch(Exception e)
                                        {
                                            JOptionPane.showMessageDialog(null, "PILIH MENGGUNAKAN ANGKA");
                                            putar_ju = true;
                                        }
                                    }
                                    while(putar_ju);
                                    jenis_usaha[x]= ket_ju;
                                    
                                    do
                                    {
                                        try
                                        {
                                            String mdl = JOptionPane.showInputDialog("MODAL");
                                            m = Double.parseDouble(mdl);
                                            salah_modal = false;
                                        }
                                        catch(Exception e)
                                        {
                                            JOptionPane.showMessageDialog(null,"Data Harus Angka");
                                            salah_modal = true;
                                        }
                                    }
                                    while(salah_modal);
                                    modal[x]= m;
                                    
                                    do
                                    {
                                        pj = JOptionPane.showInputDialog("PENJUALAN \n"
                                                + "D. DALAM NEGERI \n"
                                                + "L. LUAR NEGERI \n"
                                                + "S. DALAM DAN LUAR NEGERI");
                                    }
                                    while(!("D".equals(pj) || "d".equals(pj) || "L".equals(pj) || "l".equals(pj) || "S".equals(pj) || "s".equals(pj)));
                                    if("D".equals(pj) || "d".equals(pj))
                                    {
                                        ket_pj = "DALAM NEGERI";
                                        jml_pj = jml_pj + 1;
                                    }else if("L".equals(pj) || "l".equals(pj))
                                    {
                                        ket_pj = "LUAR NEGERI";
                                        jml_pj = jml_pj + 1;
                                    }else
                                    {
                                        ket_pj = "DALAM DAN LUAR NEGERI";
                                        jml_pj = jml_pj + 1;
                                    }
                                    penjualan[x] = ket_pj;
                                    
                                    
                                    do
                                    {
                                        pb = JOptionPane.showInputDialog("PEMBELI \n"
                                                + "D. DOMESTIK \n"
                                                + "L. LUAR \n"
                                                + "C. CAMPURAN");
                                    }
                                    while(!("D".equals(pb) || "d".equals(pb) || "L".equals(pb) || "l".equals(pb) || "C".equals(pb) || "c".equals(pb)));
                                    if("D".equals(pb) || "d".equals(pb))
                                    {
                                        ket_pb = "DALAM NEGERI";
                                        jml_pb = jml_pb + 1;
                                    }else if("L".equals(pj) || "l".equals(pj))
                                    {
                                        ket_pb = "LUAR NEGERI";
                                        jml_pb = jml_pb + 1;
                                    }else
                                    {
                                        ket_pb = "DALAM DAN LUAR NEGERI";
                                        jml_pb = jml_pb + 1;
                                    }
                                    pembeli[x] = ket_pb;
                                    
                                    
                                    do
                                    {
                                        cb = JOptionPane.showInputDialog("CABANG \n"
                                                + "T. TIDAK ADA \n"
                                                + "A. ADA ");
                                    }
                                    while(!("T".equals(cb) || "t".equals(cb) || "A".equals(cb) || "a".equals(cb)));
                                    if("T".equals(cb) || "t".equals(cb))
                                    {
                                        ket_cb = "TIDAK ADA";
                                        jml_cb = jml_cb + 1;
                                    }else
                                    {
                                        ket_cb = "ADA";
                                        jml_cb = jml_cb + 1;
                                    }
                                    cabang[x] = ket_cb;
                                    
                                    String eml = JOptionPane.showInputDialog("ALAMAT EMAIL");
                                    if("-".equals(eml))
                                    {
                                        jml_noemail = jml_noemail + 1;
                                    }else{
                                        jml_email = jml_email + 1;
                                    }
                                    alamat_email[x]= eml;
                                                                        
                                    do
                                    {
                                        try
                                        {
                                            do
                                            {
                                                sm = JOptionPane.showInputDialog("SOSIAL MEDIA \n"
                                                        + "1. FB \n"
                                                        + "2. WA \n"
                                                        + "3. IG \n"
                                                        + "4. TELEGRAM \n"
                                                        + "5. DLL \n");
                                                c = Integer.parseInt(sm);
                                            }
                                            while(!(c>=1 && c<=5));
                                            if(c==1)
                                            {
                                                ket_sm = "FACEBOOK";
                                                jml_sm = jml_sm + 1;
                                            }else if(c==2){
                                                ket_sm = "WHATSAPP";
                                                jml_sm = jml_sm + 1;
                                            }else if(c==3){
                                                ket_sm = "INSTAGRAM";
                                                jml_sm = jml_sm + 1;
                                            }else if(c==4){
                                                ket_sm = "TELEGRAM";
                                                jml_sm = jml_sm + 1;
                                            }else{
                                                ket_sm = "DAN LAIN-LAIN";
                                                jml_sm = jml_sm + 1;
                                            }
                                            putar_sm = false;
                                        }
                                        catch(Exception e)
                                        {
                                            JOptionPane.showMessageDialog(null, "PILIH MENGGUNAKAN ANGKA");
                                            putar_sm = true;
                                        }
                                    }
                                    while(putar_sm);
                                    sosial_media[x] = ket_sm;
                                    
                                    String tp = JOptionPane.showInputDialog("NO TELPON/HP");
                                    no_hp[x] = tp;
                                    if("-".equals(tp))
                                    {
                                        jml_no_nohp = jml_nohp + 1;
                                    }else{
                                        jml_nohp = jml_nohp + 1;
                                    }
                                    
                                    do
                                    {
                                        sp = JOptionPane.showInputDialog("STATUS PEMILIK ( NIKAH[N]/BELUM[B] )");
                                    }
                                    while(!("N".equals(sp) || "n".equals(sp) || "B".equals(sp) || "b".equals(sp)));
                                    if("N".equals(sp) || "n".equals(sp))
                                    {
                                        ket_sp = "NIKAH";
                                    }else{
                                        ket_sp = "BELUM NIKAH";
                                    }
                                    status_pemilik[x] = ket_sp;  
                                    
                                    
                                    info +=" NAMA TOKO      ="+nama_toko[x]+"\n";
                                    info +=" ALAMAT      ="+alamat[x]+"\n";
                                    info +=" NAMA PEMILIK      ="+nama_pemilik[x]+"\n";
                                    info +=" JENIS USAHA      ="+jenis_usaha[x]+"\n";
                                    info +=" MODAL      = RP."+modal[x]+"\n";
                                    info +=" PENJUALAN      ="+penjualan[x]+"\n";
                                    info +=" PEMBELI      ="+pembeli[x]+"\n";
                                    info +=" CABANG      ="+cabang[x]+"\n";
                                    info +=" ALAMAT EMAIL      ="+alamat_email[x]+"\n";
                                    info +=" SOSIAL MEDIA      ="+sosial_media[x]+"\n";
                                    info +=" NO TELPON / HP      ="+no_hp[x]+"\n";
                                    info +=" STATUS PEMILIK      ="+status_pemilik[x]+"\n";
                                    JOptionPane.showMessageDialog(null,info,"INFO    NO = "+no,JOptionPane.INFORMATION_MESSAGE);
                                    info = "";
                                }
                            }
                            exit_input = false;
                        }
                    }
                    while(exit_input);
                    break;
                }
                
                case "2":
                {
                    do
                    {
                        if(x== -1)
                        {
                            JOptionPane.showMessageDialog(null,"Data Kosong");
                            ed="t";
                        }
                        else{
                           ed = JOptionPane.showInputDialog("APAKAH AKAN EDIT [Y/T]");
                           if("y".equals(ed) ||"Y".equals(ed))
                           {
                               int jd = x+1;
                                do
                                {
                                  try
                                  {
                                    String  pil = JOptionPane.showInputDialog("JUMLAH DATA [1 - "+jd+"]");
                                    pl = Integer.parseInt(pil);
                                  }
                                  catch(Exception e)
                                  {
                                      JOptionPane.showMessageDialog(null,"DATA HARUS ANGKA");
                                  }
                                }
                                while(!(pl>=1 && pl<=jd));
                                int rd_edit = pl - 1;
                                info = "";
                                info +=" NAMA TOKO      = "+nama_toko[rd_edit]+"\n";
                                info +=" ALAMAT      = "+alamat[rd_edit]+"\n";
                                info +=" NAMA PEMILIK      = "+nama_pemilik[rd_edit]+"\n";
                                info +=" JENIS USAHA      = "+jenis_usaha[rd_edit]+"\n";
                                info +=" MODAL      = RP."+modal[rd_edit]+"\n";
                                info +=" PENJUALAN      = "+penjualan[rd_edit]+"\n";
                                info +=" PEMBELI      = "+pembeli[rd_edit]+"\n";
                                info +=" CABANG      = "+cabang[rd_edit]+"\n";
                                info +=" ALAMAT EMAIL      = "+alamat_email[rd_edit]+"\n";
                                info +=" SOSIAL MEDIA      = "+sosial_media[rd_edit]+"\n";
                                info +=" NO TELPON / HP      = "+no_hp[rd_edit]+"\n";
                                info +=" STATUS PEMILIK      = "+status_pemilik[rd_edit]+"\n";
                                JOptionPane.showMessageDialog(null,info,"INFO    NO = "+no,JOptionPane.INFORMATION_MESSAGE);
                                info = "";
                                
                                pil = JOptionPane.showInputDialog("DATA YANG AKAN DIEDIT [1-12]/n"
                                        + "1. NAMA TOKO\n"
                                        + "2. ALAMAT\n"
                                        + "3. NAMA PEMILIK\n"
                                        + "4. JENIS USAHA\n"
                                        + "5. MODAL\n"
                                        + "6. PENJUALAN\n"
                                        + "7. PEMBELI\n"
                                        + "8. CABANG\n"
                                        + "9. ALAMAT EMAIL\n"
                                        + "10. SOSIAL MEDIA\n"
                                        + "11. NO TELEPON /HP\n"
                                        + "12. STATUS PEMILIK\n");
                                //bagian edit data                                
                                switch(pil)
                                {
                                    case "1":
                                    {
                                        String nt = JOptionPane.showInputDialog("NAMA TOKO");
                                        nama_toko[rd_edit]= nt;
                                        break;
                                    }
                                    
                                    case "2":
                                    {
                                        String almt = JOptionPane.showInputDialog("ALAMAT");
                                        alamat[rd_edit]= almt;
                                        break;
                                    }
                                    
                                    case "3":
                                    {
                                        String np = JOptionPane.showInputDialog("NAMA PEMILIK");
                                        nama_pemilik[rd_edit]= np;
                                        break;
                                    }
                                    
                                    case "4":
                                    {
                                        do
                                        {
                                            try
                                            {
                                                do
                                                {
                                                    String ju = JOptionPane.showInputDialog("JENIS USAHA \n"
                                                        + "1. PAKAIAN \n"
                                                        + "2. SARUNG \n"
                                                        + "3. MAKANAN/MINUMAN \n"
                                                        + "4. SEPATU/TAS \n"
                                                        + "5. ELEKTRONIK \n"
                                                        + "6. BARANG BEKAS \n"
                                                        + "7. LAIN-LAIN");
                                                    j = Integer.parseInt(ju);
                                                }
                                                while(!(j>=1 && j<=7));
                                                if(j==1){
                                                    ket_ju = "PAKAIAN";
                                                    jml_j = jml_j + 1;
                                                }else if(j==2){
                                                    ket_ju = "SARUNG";
                                                    jml_j = jml_j + 1;
                                                }else if(j==3){
                                                    ket_ju = "MAKANAN/MINUMAN";
                                                    jml_j = jml_j + 1;
                                                }else if(j==4){
                                                    ket_ju = "SAPATU/TAS";
                                                    jml_j = jml_j + 1;
                                                }else if(j==5){
                                                    ket_ju = "ELEKTRONIK";
                                                    jml_j = jml_j + 1;
                                                }else if(j==6){
                                                    ket_ju = "BARANG BEKAS";
                                                    jml_j = jml_j + 1;
                                                }else{
                                                    ket_ju = "LAIN - LAIN";
                                                    jml_j = jml_j + 1;
                                                }
                                                putar_ju = false;
                                            }
                                            catch(Exception e)
                                            {
                                                JOptionPane.showMessageDialog(null, "PILIH MENGGUNAKAN ANGKA");
                                                putar_ju = true;
                                            }
                                        }
                                        while(putar_ju);
                                        jenis_usaha[rd_edit]= ket_ju;
                                        break;
                                    }
                                    
                                    case "5":
                                    {
                                        do
                                        {
                                            try
                                            {
                                                String mdl = JOptionPane.showInputDialog("MODAL");
                                                m = Double.parseDouble(mdl);
                                                salah_modal = false;
                                            }
                                            catch(Exception e)
                                            {
                                                JOptionPane.showMessageDialog(null,"Data Harus Angka");
                                                salah_modal = true;
                                            }
                                        }
                                        while(salah_modal);
                                        modal[rd_edit]= m;
                                        break;
                                    }
                                    
                                    case "6":
                                    {
                                        do
                                        {
                                            pj = JOptionPane.showInputDialog("PENJUALAN \n"
                                                    + "D. DALAM NEGERI \n"
                                                    + "L. LUAR NEGERI \n"
                                                    + "S. DALAM DAN LUAR NEGERI");
                                        }
                                        while(!("D".equals(pj) || "d".equals(pj) || "L".equals(pj) || "l".equals(pj) || "S".equals(pj) || "s".equals(pj)));
                                        if("D".equals(pj) || "d".equals(pj))
                                        {
                                            ket_pj = "DALAM NEGERI";
                                            jml_pj = jml_pj + 1;
                                        }else if("L".equals(pj) || "l".equals(pj))
                                        {
                                            ket_pj = "LUAR NEGERI";
                                            jml_pj = jml_pj + 1;
                                        }else
                                        {
                                            ket_pj = "DALAM DAN LUAR NEGERI";
                                            jml_pj = jml_pj + 1;
                                        }
                                        penjualan[rd_edit] = ket_pj;
                                        break;
                                    }
                                    
                                    case "7":
                                    {
                                        do
                                        {
                                            pb = JOptionPane.showInputDialog("PEMBELI \n"
                                                    + "D. DOMESTIK \n"
                                                    + "L. LUAR \n"
                                                    + "C. CAMPURAN");
                                        }
                                        while(!("D".equals(pb) || "d".equals(pb) || "L".equals(pb) || "l".equals(pb) || "C".equals(pb) || "c".equals(pb)));
                                        if("D".equals(pb) || "d".equals(pb))
                                        {
                                            ket_pb = "DALAM NEGERI";
                                            jml_pb = jml_pb + 1;
                                        }else if("L".equals(pj) || "l".equals(pj))
                                        {
                                            ket_pb = "LUAR NEGERI";
                                            jml_pb = jml_pb + 1;
                                        }else
                                        {
                                            ket_pb = "DALAM DAN LUAR NEGERI";
                                            jml_pb = jml_pb + 1;
                                        }
                                        pembeli[rd_edit] = ket_pb;
                                        break;
                                    }
                                    
                                    case "8":
                                    {
                                        do
                                        {
                                            cb = JOptionPane.showInputDialog("CABANG \n"
                                                    + "T. TIDAK ADA \n"
                                                    + "A. ADA ");
                                        }
                                        while(!("T".equals(cb) || "t".equals(cb) || "A".equals(cb) || "a".equals(cb)));
                                        if("T".equals(cb) || "t".equals(cb))
                                        {
                                            ket_cb = "TIDAK ADA";
                                            jml_cb = jml_cb + 1;
                                        }else
                                        {
                                            ket_cb = "ADA";
                                            jml_cb = jml_cb + 1;
                                        }
                                        cabang[rd_edit] = ket_cb;
                                        break;
                                    }
                                    
                                    case "9":
                                    {
                                        String eml = JOptionPane.showInputDialog("ALAMAT EMAIL");
                                        if("-".equals(eml))
                                        {
                                            jml_noemail = jml_noemail + 1;
                                        }else{
                                            jml_email = jml_email + 1;
                                        }
                                        alamat_email[rd_edit]= eml;
                                        break;
                                    }
                                    
                                    case "10":
                                    {
                                        do
                                        {
                                            try
                                            {
                                                do
                                                {
                                                    sm = JOptionPane.showInputDialog("SOSIAL MEDIA \n"
                                                            + "1. FB \n"
                                                            + "2. WA \n"
                                                            + "3. IG \n"
                                                            + "4. TELEGRAM \n"
                                                            + "5. DLL \n");
                                                    c = Integer.parseInt(sm);
                                                }
                                                while(!(c>=1 && c<=5));
                                                if(c==1)
                                                {
                                                    ket_sm = "FACEBOOK";
                                                    jml_sm = jml_sm + 1;
                                                }else if(c==2){
                                                    ket_sm = "WHATSAPP";
                                                    jml_sm = jml_sm + 1;
                                                }else if(c==3){
                                                    ket_sm = "INSTAGRAM";
                                                    jml_sm = jml_sm + 1;
                                                }else if(c==4){
                                                    ket_sm = "TELEGRAM";
                                                    jml_sm = jml_sm + 1;
                                                }else{
                                                    ket_sm = "DAN LAIN-LAIN";
                                                    jml_sm = jml_sm + 1;
                                                }
                                                putar_sm = false;
                                            }
                                            catch(Exception e)
                                            {
                                                JOptionPane.showMessageDialog(null, "PILIH MENGGUNAKAN ANGKA");
                                                putar_sm = true;
                                            }
                                        }
                                        while(putar_sm);
                                        sosial_media[rd_edit] = ket_sm;
                                        break;
                                    }
                                    
                                    case "11":
                                    {
                                        String tp = JOptionPane.showInputDialog("NO TELPON/HP");
                                        no_hp[x] = tp;
                                        if("-".equals(tp))
                                        {
                                            jml_no_nohp = jml_nohp + 1;
                                        }else{
                                            jml_nohp = jml_nohp + 1;
                                        }
                                        break;
                                    }
                                    
                                    case "12":
                                    {
                                        String eml = JOptionPane.showInputDialog("ALAMAT EMAIL");
                                        if("-".equals(eml))
                                        {
                                            jml_noemail = jml_noemail + 1;
                                        }else{
                                            jml_email = jml_email + 1;
                                        }
                                        alamat_email[rd_edit]= eml;
                                        break;
                                    }
                                }
                           }  
                        }
                    }
                    while("Y".equals(ed) || "y".equals(ed));
                    break;
                }
                
                case "3":
                {
                    //hapus data                    
                    hp = "y";
                    do
                    {
                        hp= JOptionPane.showInputDialog("INGIN HAPUS DATA [Y/T] ");
                        if("y".equals(hp) || "Y".equals(hp))
                        {
                            if(x==-1)
                            {
                                JOptionPane.showMessageDialog(null,"Data Kosong");
                                hp = "t";
                            }else
                            {
                                int rd_hapus = x +1;
                                String dt = JOptionPane.showInputDialog("DATA TERSEDIA [1 - "+rd_hapus+"]");
                                int dt_int = Integer.parseInt(dt);
                                info = "";
                                info +=" NAMA TOKO      = "+nama_toko[dt_int-1]+"\n";
                                info +=" ALAMAT      = "+alamat[dt_int-1]+"\n";
                                info +=" NAMA PEMILIK      = "+nama_pemilik[dt_int-1]+"\n";
                                info +=" JENIS USAHA      = "+jenis_usaha[dt_int-1]+"\n";
                                info +=" MODAL      = RP."+modal[dt_int-1]+"\n";
                                info +=" PENJUALAN      = "+penjualan[dt_int-1]+"\n";
                                info +=" PEMBELI      = "+pembeli[dt_int-1]+"\n";
                                info +=" CABANG      = "+cabang[dt_int-1]+"\n";
                                info +=" ALAMAT EMAIL      = "+alamat_email[dt_int-1]+"\n";
                                info +=" SOSIAL MEDIA      = "+sosial_media[dt_int-1]+"\n";
                                info +=" NO TELPON / HP      = "+no_hp[dt_int-1]+"\n";
                                info +=" STATUS PEMILIK      = "+status_pemilik[dt_int-1]+"\n";
                                JOptionPane.showMessageDialog(null,info,"INFO    NO = "+rd_hapus,JOptionPane.INFORMATION_MESSAGE);
                                info = "";

                                if(dt_int==1)
                                {
                                    for(int i =0; i<=x ;i=i+1)
                                    {
                                        nama_toko[i] = nama_toko[i+1];
                                        alamat[i] = alamat[i+1];
                                        nama_pemilik[i] = nama_pemilik[i+1];
                                        jenis_usaha[i] = jenis_usaha[i+1];
                                        modal[i] = modal[i+1];
                                        penjualan[i] = penjualan[i+1];
                                        pembeli[i] = pembeli[i+1];
                                        cabang[i] = cabang[i+1];
                                        alamat_email[i] = alamat_email[i+1];
                                        sosial_media[i] = sosial_media[i+1];
                                        no_hp[i] = no_hp[i+1];
                                        status_pemilik[i] = status_pemilik[i+1];

                                    }

                                }
                                else if(dt_int>=2 && dt_int<rd_hapus)
                                {
                                    for (int r= dt_int-1; r<=x; r=r+1)
                                    {
                                        nama_toko[r] = nama_toko[r+1];
                                        alamat[r] = alamat[r+1];
                                        nama_pemilik[r] = nama_pemilik[r+1];
                                        jenis_usaha[r] = jenis_usaha[r+1];
                                        modal[r] = modal[r+1];
                                        penjualan[r] = penjualan[r+1];
                                        pembeli[r] = pembeli[r+1];
                                        cabang[r] = cabang[r+1];
                                        alamat_email[r] = alamat_email[r+1];
                                        sosial_media[r] = sosial_media[r+1];
                                        no_hp[r] = no_hp[r+1];
                                        status_pemilik[r] = status_pemilik[r+1];
                                    }
                                }
                                x=x-1;
                            }
                        }
                    }
                    while("Y".equals(hp) || "Y".equals(hp));
                    break;
                }
                
                case "4":
                {
                    z=-1;
                     sisa = (x+1)%4;
                    if(sisa ==0)
                    {
                        h = (x+1)/4;
                    }
                    else
                    {
                        h = ( (x+1)/4)+1;
                    }

                    if (h==1)
                    {
                        x1 = 1;
                        x2 =  (x+1);
                    }
                    else
                    {
                          x1=1;
                          x2=3;
                    }
                    for (int i = 1;   i <=h;    i=i+1)
                    {
                        rekap ="";
                        rekap = " TANGGAL = "+ts+"                            HAL = "+i+"\n";
                        rekap +=" =======================================================\n";
                        rekap +="  NO   NAMA TOKO   ALAMAT   NAMA PEMILIK   JENIS USAHA  \n";
                        rekap +=" =======================================================\n";
                        if (x==-1)
                        {
                            rekap+=" DATA KOSONG \n";
                        }
                         if (i==h) // halaman terakhir
                         {
                             x2=x+1;
                         }
                         for(int w=x1;   w<=x2;     w=w+1)
                         {
                           z = z+1;
                            h = h + 1;
                            rekap +=" "+h+"      "+nama_toko[z]+"     "+alamat[z]+"    "+nama_pemilik[z]+"      "+jenis_usaha[z]+"\n";
                         }
                              rekap +=" ======================================================= \n";
                              x1=x1+3;
                              x2=x2+3;
                              JOptionPane.showMessageDialog(null,rekap,"REKAP DATA",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                }
                
                case "5":
                {
                    
                    break;
                }
                
                case "6":
                {
                    
                    break;
                }
                
                case "7":
                {
                    break;
                }
                
                case "8":
                {
                    menu = "8";
                    break;
                }
                
                case "9":
                {
                    rekap ="";
                    rekap +=ts+"\n";
                    rekap +=" ===================================================================================================================================================== \n";
                    rekap +="  NO   NAMA TOKO   ALAMAT   NAMA PEMILIK   JENIS USAHA     MODAL   PENJUALAN   PEMBELI     CABANH      ALAMAT EMAIL    SOSIAL MEDIA    NO TEL  STATUS  \n";
                    rekap +=" ===================================================================================================================================================== \n";
                    if (x==-1)
                            {

                        rekap+=" DATA KOSONG \n";

                            }
                    int h = 0;
                    for(int i=0; i<=x; i=i+1)
                    {
                        h = h + 1;
                       rekap +=" "+h+"      "+nama_toko[i]+"     "+alamat[i]+"    "+nama_pemilik[i]+"      "+jenis_usaha[i]+"      "+modal[i]+"      "+penjualan[i]+"      "+pembeli[i]+"      "+cabang[i]+"      "+alamat_email[i]+"      "+sosial_media[i]+"      "+no_hp[i]+"      "+status_pemilik[i]+"\n";
                    }
                    rekap +=" ============================= \n";
                    rekap += "jml no hp = "+jml_nohp+"\n";
                    rekap += "jml email = "+jml_email+"\n";
                JOptionPane.showMessageDialog(null,rekap,"REKAP DATA",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        while("1".equals(menu) || "2".equals(menu) || "3".equals(menu) || "4 ".equals(menu) || "5".equals(menu) || "6".equals(menu) || "7".equals(menu) || "9".equals(menu));
        System.exit(0);
    }
}
