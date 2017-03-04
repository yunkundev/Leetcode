public class Solution
{



    public static boolean isMatch(String s, String p)
    {


        	if( s.length() == 0 && p.length() == 0 )
        	{
        		return true;
        	}
        	else if( p.length() == 0 )
        	{
        		return false;
        	}
        	else if( s.length() == 0 )
        	{
        		if( p.length() > 1 && p.charAt(1) == '*' ) return isMatch(s, p.substring(2));
        		else return false;
        	}

        	if(p.charAt(0) == '.')
        	{
        		if( p.length() > 1 && p.charAt(1) == '*' )
        		{
        			// a* is empty
        			if(isMatch(s, p.substring(2)) ) return true;
        			// a* is a,aa,aaa ...
        			for(int i = 0; i < s.length(); i++)
        			{
        				if(isMatch( s.substring(i+1), p.substring(2)) ) return true;
        			}
        			return false;
        		}
        		else
        		{
        			return isMatch(s.substring(1), p.substring(1));
        		}

        	}
        	else if( s.charAt(0) == p.charAt(0) )
        	{
        		// if it match the regular such as a*
        		if( p.length() > 1 && p.charAt(1) == '*' )
        		{
        			// a* is empty
        			if(isMatch(s, p.substring(2)) ) return true;

        			// a* is a,aa,aaa ...
        			for(int i = 0; i < s.length(); i++)
        			{
        				if(s.charAt(i) == p.charAt(0)) 	{if(isMatch(s.substring(i+1), p.substring(2))) return true;}
        				else	break;

        			}
        			return false;
        		}
        		else
        		{
        			return isMatch(s.substring(1), p.substring(1));
        		}

        	}
        	else
        	{
        		if( p.length() > 1 && p.charAt(1) == '*' ) return isMatch(s, p.substring(2));
        		else return false;
        	}


    }


}
