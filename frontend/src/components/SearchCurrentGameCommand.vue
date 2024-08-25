<template>
    <v-card outlined>
        <v-card-title>
            SearchCurrentGame
        </v-card-title>

        <v-card-text>
            <String label="GameId" v-model="value.gameId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="searchCurrentGame"
            >
                SearchCurrentGame
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'SearchCurrentGameCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.gameId = '';
        },
        watch: {
        },
        methods: {
            searchCurrentGame() {
                this.$emit('searchCurrentGame', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

