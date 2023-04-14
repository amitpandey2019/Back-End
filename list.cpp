
//global
struct Node*head=NULL;
struct Node*second=NULL;
struct Node=NULL;

// Structure of Node
struct Node{
    int data;//Data
    struct Node*next;//address of
next struct node
};

//traversal
void printList(struct Node* n){
    printf("\n");
    while(n !=NULL){
        printf("%d\n",n->data);
        n=n->next;//ye nahi likhi thi
    }
}
//insert at begining
void insert_beg(int val){
    struct Node* newNode=NULL;//
    insert
    newNode=(struct Node*)
    malloc(sizeof(struct Node));
    newNode->data=val;

    struct Node*temp=head;

    for(int i=2;i<pos;i++){
        if(temp->next!=NULL){
            temp=temp->next;
        }
    }
    newNode->next=temp->next;//
    Joining Link
    temp->next=newNode;//Breaking
    Link
}
// insert at end
void insert_end(int val){
    struct Node*newNode=NULL;//
    insert
    newNode=(struct Node*)
    malloc(sizeof(struct Node));
    newNode->data=val;
    newNode->next=NULL;

    //traversal to find last second node 
    or last.
    struct Node*temp=head;
    while(temp->next!=NULL){
        temp=temp->;
    }

//adding address of last(new)node
in second last node
temp->next=newNode;
}
int main(){

    //memory allocation
    head=(struct Node*)
    malloc(sizeof(struct Node));
    second=(struct Node*)
    malloc(sizeof(struct Node));
    third=(struct Node*)
    malloc(sizeof(struct Node));

    //Node 1
    head->data=1;//head is a pointing to
    first node and data value is assigned
    head->next=second;//address of
    next node

    ///Node 2
    second->data=2;
    second->next=third;

    //Node 3
    third->data=3;
    third->next=NULL;
    //traversal
    printList(head);
    insert_beg(10);
    insert_pos(3,300);
    insert_end(20);
    printList(head);
    return 0;
}
