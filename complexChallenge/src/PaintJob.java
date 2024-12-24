public class PaintJob {

        public static int getBucketCount(double height  , double width , double areaPerBucket, double extraBuckets){

            if(height <=0 || width<=0 || areaPerBucket <=0 || extraBuckets <0){

                return -1;
            }

            double area = width * height;
            double buckneed = area / areaPerBucket;
            double finalBuckets =  buckneed - extraBuckets;

            return (int) Math.ceil(finalBuckets);

        }

    public static int getBucketCount(double height  , double width , double areaPerBucket){

        if(height <=0 || width<=0 || areaPerBucket <=0 ){

            return -1;
        }

        double area = width * height;
        double buckNeed = area / areaPerBucket;


        return  (int) Math.ceil(buckNeed);


    }

    public static int getBucketCount( double Area , double areaPerBucket){

        if(Area<=0 || areaPerBucket <=0 ){

            return -1;
        }


        double finalBuckets = Area / areaPerBucket;


        return (int) Math.ceil(finalBuckets);

    }

    }


