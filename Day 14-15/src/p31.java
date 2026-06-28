class Resource implements AutoCloseable {


    public void work()
            throws Exception
    {
        throw new Exception("Main Exception");
    }


    public void close()
            throws Exception
    {
        throw new Exception("Close Exception");
    }
}


public class p31 {

    public static void main(String[] args)
    {

        try(Resource r=new Resource())
        {

            r.work();

        }
        catch(Exception e)
        {

            System.out.println(
                    e.getMessage());

            for(Throwable t:
                    e.getSuppressed())
            {
                System.out.println(
                        t.getMessage());
            }
        }
    }
}