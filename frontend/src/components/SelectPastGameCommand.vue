<template>
    <v-card outlined>
        <v-card-title>
            SelectPastGame
        </v-card-title>

        <v-card-text>
            <String label="GameId" v-model="value.gameId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="selectPastGame"
            >
                SelectPastGame
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
        name: 'SelectPastGameCommand',
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
            selectPastGame() {
                this.$emit('selectPastGame', this.value);
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

