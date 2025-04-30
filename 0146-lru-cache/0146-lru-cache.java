class Node{
    public int key, val;
    public Node next, prev;

    Node(){
        key = val = -1;
        next = prev = null;
    } 

    Node(int key, int value){
        this.key = key;
        this.val = value;
    }
}

class LRUCache {

    private HashMap<Integer, Node> mpp;
    private int cap;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        mpp = new HashMap<>();
        cap = capacity;

        head = new Node();
        tail = new Node();

        head.next = tail;
        tail.prev = head;
        
    }

    private void insertAfterHead(Node node){

        Node secNode = head.next;

        head.next = node;
        node.prev =  head;

        node.next = secNode;
        secNode.prev = node; 
    }


    private void deleteNode(Node node){

        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
    
    public int get(int key_) {

        if(!mpp.containsKey(key_)){
            return -1;
        }

        Node node = mpp.get(key_);
        int value = node.val;

        deleteNode(node);

        insertAfterHead(node);

        return value;
        
    }
    
    public void put(int key_, int value) {

        if(mpp.containsKey(key_)){

            Node node = mpp.get(key_);

            node.val = value;

            deleteNode(node);
            insertAfterHead(node);
            return;

        }

        if(mpp.size() == cap){
            
            Node remNode = tail.prev;
            deleteNode(remNode);
            mpp.remove(remNode.key);
            
        }
        
        Node newNode = new Node(key_, value);
        mpp.put(key_, newNode);
        insertAfterHead(newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */