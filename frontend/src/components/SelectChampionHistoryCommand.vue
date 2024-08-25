<template>
    <v-card outlined>
        <v-card-title>
            SelectChampionHistory
        </v-card-title>

        <v-card-text>
            <String label="ChampionId" v-model="value.championId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="selectChampionHistory"
            >
                SelectChampionHistory
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
        name: 'SelectChampionHistoryCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.championId = '';
        },
        watch: {
        },
        methods: {
            selectChampionHistory() {
                this.$emit('selectChampionHistory', this.value);
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

