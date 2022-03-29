static void insertAtBottom(char x){

    if(st.isEmpty())
        st.push(x); //dont need return statement coz if else and void

    else{
      
        char a = st.peek();
        st.pop();
        insertAtBottom(x);
        st.push(a);
    }
}
