package com.example.flea.data.models

import com.example.flea.R

data class Film(
    val id: Long,
    val image: Int,
    val title: String,
    val desc: String,
)

fun generateFilms() = listOf<Film>(
    Film(
        id = 1,
        image = R.drawable.everything,
        "Everything Everywhere All at Once",
        "Konsep multiverse adalah hal utama yang diangkat film Everything Everywhere All at Once. Film ini mengisahkan Evelyn Wang, seorang wanita senja yang hidupnya pas-pasan dalam hal ekonomi. Dia adalah imigran Cina yang kini menetap di Amerika Serikat.\n" +
                "\n" +
                "Evelyn bekerja keras setiap hari agar bisa memenuhi kebutuhannya. Masalah semakin rumit ketika ia harus menghadapi petugas pajak untuk mengurus birokrasi dan dokumen.\n" +
                "\n" +
                "Ketika itu, Evelyn secara misterius terlempar ke dunia paralel yang mana ia memiliki misi untuk menghentikan penjahat yang akan mengacaukan alam semesta."
    ),
    Film(
        id = 2,
        R.drawable.batman,
        "The Batman",
        "Kota Gotham tiba-tiba dikejutkan dengan rentetan pembunuhan para pejabat. Aksi tersebut dilakukan oleh seseorang misterius yang mengaku dirinya “The Riddler”.\n" +
                "\n" +
                "The Riddler kerap meninggalkan sepucuk pesan atau teka-teki agar seseorang bisa menemukannya. Karena ini, Batman berupaya untuk menghentikan aksi The Riddler.\n" +
                "\n" +
                "Batman atau Bruce Wayne kali ini diperankan oleh aktor tampan Robert Pattinson. Batman bekerjasama dengan asisten pribadinya, Alfred Pennyworth dan Lt. James Gordon."
    ),
    Film(
        id = 3,
        R.drawable.topgunmaverick,
        "Top Gun Maverick",
        "Sesuai judulnya, Top Gun: Maverick yang juga dikenal dengan judul Top Gun 2 merupakan sekuel dari film Top Gun yang pernah dirilis pada tahun 1986 silam. Top Gun termasuk film action terbaik barat dengan rating 8.6 di IMDb.\n" +
                "\n" +
                "Film yang dibintangi Tom Cruise ini digarap oleh Paramount Pictures. Kamu akan melihat aksi kapten Pete 'Maverick' Mitchell (Tom Cruise) yang merupakan seorang instruktur penerbang.\n" +
                "\n" +
                "Dipertemukan dengan anak dari mendiang teman baiknya, Maverick pun harus menghadapi ketidakpastian masa depan sekaligus dihantui masa lalunya."
    ),
    Film(
        id = 4,
        R.drawable.tenet,
        "Tenet",
        "Film berdurasi 2 jam 30 menit ini ditulis dan disutradarai oleh Christopher Nolan. Dibintangi oleh John David Washington, Robert Pattinson, Elizabeth Debicki, dan, Dimple Kapadia.\n" +
                "\n" +
                "Berdurasi 2 jam 30 menit, film Tenet mengisahkan Protagonist, yang berusaha mencegah terjadinya perang dunia ketiga melalui penjelajahan waktu.\n" +
                "\n" +
                "Seperti film-film Nolan lainnya, Tenet menyuguhkan cerita yang rumit dengan plot yang tidak terduga."
    ),
    Film(
        id = 5,
        R.drawable.lostbullet,
        "Lost Bullet",
        "Mendapatkan tuduhan pembunuhan, seorang mekanik harus membuktikan dirinya tidak bersalah. Bukti yang dapat menyelamatkannya adalah sebuah peluru yang berada dalam mobil yang hilang.\n" +
                "\n" +
                "Film asa Perancis berdurasi 1 jam 33 menit ini dibintangi oleh Albain Lenoir dan Nicolas Duvauchelle. Jika kamu tertarik dengan film Lost Bullet, kamu bisa mengaksesnya dalam layanan streaming Netflix."
    ),
    Film(
        id = 6,
        R.drawable.extraction,
        "Extraction",
        "Film ini menceritakan tentang Tyler Rake, seorang tentara bayaran di pasar gelap yang ditugaskan untuk menyelamatkan Ovi, seorang anak dari penguasa narkoba terbesar di India.\n" +
                "\n" +
                "Misi penyelamatan ini berlangsung di Bangladesh di mana Ovi ditahan sebagai tebusan oleh bandar narkoba terbesar di sana.\n" +
                "\n" +
                "Film garapan Sam Hargrave ini dibintangi oleh Chris Hemsworth, Rudhraksh Jaiswal, dan Randeep Hooda."
    ),
    Film(
        id = 7,
        R.drawable.bloodshot,
        "Bloodshot",
        "Dalam film ini kamu akan menemukan Vin Diesel berakting sebagai seorang prajurit perang yang tewas terbunuh.\n" +
                "\n" +
                "Kemudian, Ray (Vin Diesel) dihidupkan kembali dan diberikan kekuatan khusus yaitu bisa sembuh dari luka oleh tim ilmuwan.\n" +
                "\n" +
                "Dalam hidupnya yang baru, Ia tak bisa membedakan kehidupan nyata. Akhirnya datanglah beberapa ingatan di masa lalu tentang orang yang membunuh dia dan istrinya sehingga mendorongnya untuk membalaskan dendam pada pelaku pembunuhan tersebut."
    ),
    Film(
        id = 8,
        R.drawable.theoldguard,
        "The Old Guard",
        "Film keluaran Netflix ini dibintangi oleh Charlize Theron, KiKi Layne, dan Marwan Kenzari.\n" +
                "\n" +
                "The Old Guard merupakan cerita tentang sebuah kelompok prajurit rahasia dengan kemampuan khusus yaitu dapat hidup abadi. Dengan kemampuan ini, mereka melindungi dunia selama berabad-abad.\n" +
                "\n" +
                "Keberadaan mereka terancam ketika kekuatan mereka diketahui dan menjadi incaran orang-orang yang ingin menggunakan kekuatan tersebut untuk kepentingan pribadi."
    ),
    Film(
        id = 9,
        R.drawable.bbfl,
        "Bad Boys For Life",
        "Bad Boys for Life merupakan Film ke-3 Bad Boys yang kali ini mengisahkan tentang aksi pasangan detektif Mike Lowrey dan detektif Marcus Burnett. Semula, mereka tak lagi menjadi rekan dalam satu misi karena Burnett sudah tua dan menjabat sebagai inspektur.\n" +
                "\n" +
                "Mike, ditugaskan untuk menjalankan misi bersama sekelompok polisi muda. Misi tersebut tidak berjalan dengan lancar sehingga Mike akhirnya dipersatukan kembali dengan Burnett. Keduanya kembali beraksi untuk terakhir kali membasmi penjahat yang sangat keji.\n" +
                "\n" +
                "Unsur komedi dalam film sangat kental dengan mengandalkan akting Will Smith dan Martin Lawrence yang memiliki chemistry yang pas. Walapun sudah 17 tahun tidak beradu acting, kamu tidak akan menemukan rasa canggung di antara mereka berdua."
    ),
    Film(
        id = 10,
        R.drawable.hlbp,
        "Harley Quinn: Birds of Prey",
        "Birds sof Prey berkisah setelah Suicide Squad dimana Harley Quinn (Margot Robbie) yang putus dengan kekasihnya, Joker.\n" +
                "\n" +
                "Usai hubungannya kandas, Quinn bersama teman-temannya perempuan yang antihero lainnya membuat onar di kota Gohtan untuk menyembuhkan luka di hatinya.\n" +
                "\n" +
                "Tidak hanya itu, Harley Quinn akan berhadapan dengan musuh utamanya, Black Mask. Film solo Harley Quinn ini menyajikan aksi yang intens, dan penuh warna."
    )
)