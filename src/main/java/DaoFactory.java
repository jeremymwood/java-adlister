public class DaoFactory {
    private static Ads adsDao;
    private static Books booksDao;

    public static Ads getAdsDao() {
        Config config = new Config();
        if (adsDao == null) {
//            adsDao = new ListAdsDao();
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

    public static Books getBooksDao() {
        if (booksDao == null) {
            Config config = new Config();
            booksDao = new MySQLBooksDao(config);
        }
        return booksDao;
    }
}