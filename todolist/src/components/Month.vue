<template>
  <div>
    <button class="btn btn-outline-dark" @click="sendMonth()">{{ name }}</button>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: "Month",
  props: {
    name: String,
    month: Number,
  },
  data() {
    return{
      todolist:[]
    }
  },
  methods:{
    sendMonth(){
      axios.get('/data/'+this.month)
      .then(res => {
        console.log(res)
        this.todolist = res.data
        this.$emit('monthTodoList', this.todolist)
        this.$emit('nowMonth', this.month)
      })
      .catch(error => {
          console.log(error)
        })
    }
  }
}
</script>