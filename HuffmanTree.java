public class HuffmanTree
{
    private HuffmanTriple content;
    private HuffmanTree leftChild, rightChild; 

    // empty tree
    public HuffmanTree() 
    {
        content = null;
        leftChild = null;
        rightChild = null;
    }

    // single node tree 
    public HuffmanTree( HuffmanTriple t ) 
    {
        content = t;
        leftChild = new HuffmanTree();
        rightChild = new HuffmanTree();
    }

    // new root for multiple nodes tree 
    public HuffmanTree( HuffmanTree lc, HuffmanTree rc ) 
    {
        content = new HuffmanTriple ( ' ', lc.getContent().getQuantity() + rc.getContent().getQuantity() );
        leftChild = lc;
        rightChild = rc;
    }

    public boolean isEmpty()
    {
        return content == null;
    }

    public boolean isLeaf()
    {
        return !isEmpty() && leftChild.isEmpty() && rightChild.isEmpty();
    }

    public HuffmanTriple getContent() 
    {
        if ( !isEmpty() )
        {
            return content;
        } else {
            throw new IllegalStateException();
        }
    }

    public int compareTo ( HuffmanTree other ) 
    {
        if ( !isEmpty() && !other.isEmpty() )
        {
            return content.compareTo( other.content );
        } else {
            throw new IllegalStateException();
        }
    }
    
    public void generateCodes()
    {

        if ( !isEmpty() && !isLeaf() ) 
        {
            leftChild.content.setCode( content.getCode() + "0" );
            leftChild.generateCodes();
            rightChild.content.setCode( content.getCode() + "1" );
            rightChild.generateCodes();
        }

    }
    
    public String decode( String toDecode ) {
        HuffmanTree currentTree = this;//root
        StringBuilder decodedData = new StringBuilder();
        
        for ( int i = 0; i < toDecode.length(); i++ ) {
            char c = toDecode.charAt(i);
            if ( c == '0' ) {
                currentTree = this.leftChild;
            } else {
                if ( c == '1' ) {
                    currentTree = this.rightChild;
                } else {
                    throw new RuntimeException( "Kein gültiger Bitstring" );
                }
                
            }
            if ( currentTree.isLeaf() ) {
                decodedData.append(currentTree.content.getToken());
                currentTree = this;//root
            }
        }
        
        if ( currentTree != this ) { throw new RuntimeException( "Kein gültiger Bitstring" ); }
        
        return decodedData.toString();
    }

    public void showCodes()
    {
        if ( !isEmpty() )
        {
            if ( isLeaf() )
            {
                System.out.println( content.toString() );
            }
            else
            {
                leftChild.showCodes();
                rightChild.showCodes();
            }
        }
    }

}
