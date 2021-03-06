/*
 * Copyright 2016 Sam Sun <me@samczsun.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.samczsun.skype4j.formatting.lang;

import com.samczsun.skype4j.formatting.IMoji;

import java.util.HashMap;
import java.util.Map;

public enum DefaultMoji implements IMoji {
        
    DESPICABLEME("7e241717964a403dbab21be9fa860c81", "01fdf549-b6dc-4319-983c-1dd2d42f35e6", "Despicable Me"),
    DESPICABLEME_1("ca62da9e0ae54dca8b36ae300cb63991", "2aae7c79-39c3-4e57-a280-05179c416e2d", "Despicable Me 2"),
    DESPICABLEME_2("0b9704a393a846ea845821cc8eea157f", "a9b07f96-218b-41f7-9407-627ab69dba8a", "Despicable Me"),
    DESPICABLEME_3("fa451ed1b5d445cabd0f19f55e140464", "3e2cdf62-c862-4946-a3d4-ced490eae8e9", "Despicable Me 2"),
    MUPPETMOJIS("6a5957a4a4464f7c9ae4d212a56f0be1", "9975a127-7906-41a8-ac0b-5c4ddfcc8c1e", "Muppet Mojis"),
    RAONE("e2845047b8224c49a1ab3433aca5c9cf", "b7e2d9eb-447f-4125-a423-1a1fcf4c0bd9", "Ra.One"),
    FURIOUS("22324d43134e4a1abb64e108e3521f76", "e0562453-16a9-4319-8209-c20a8f75bb8c", "Furious 7"),
    CHARLOTTESWEB("16c5bfa6856c40f9a067dc1367826ec2", "cc70fb0e-f28d-4278-9412-bee9ad4f2a9b", "Charlotte’s Web"),
    THEOFFICE("80a924da6ef046eba68363d618684702", "63993a6e-f1fb-4557-b52a-6c2c87fe5780", "The Office"),
    CHARLOTTESWEB_1("d377f74f5bc440e6a24d050d94cb5e9f", "a023dc2d-6ef2-4d49-bb37-91a8adc17beb", "Charlotte’s Web"),
    TED("238d80dc959947cc94ae9200e8ce8d89", "ed7b1c2d-c3af-4ca7-8749-620e0f41b3b4", "Ted"),
    DESPICABLEME_4("851d973d722b42459b4f7ca37b528130", "5a941a45-8c11-4a8a-828a-ce9525726e4b", "Despicable Me"),
    BRIDESMAIDS("aff5b84ab7274da687f581c3f1e0df62", "124c3da6-8d00-4586-ad7c-4546f18092d3", "Bridesmaids"),
    THEYEAROLDVIRGIN("5bef41a5d2c3482a91e17d1aa019925c", "204d1996-2f87-4325-92bf-e4f7d7d8b804", "The 40 Year Old Virgin"),
    SHERLOCK("7ef1c909f6794cad8d9732db56f195df", "aa754658-baae-42f8-9d05-feabbc9f29b6", "Sherlock"),
    THEMUPPETS("34d1910863f0495bbc1902dd77ebe391", "eb189204-6815-4933-8e06-f30e2c890216", "The Muppets"),
    PITCHPERFECT("d766abdbbc1e4872a369e80dd2a7830c", "5c2e5610-1066-4512-a454-cfb548b7917a", "Pitch Perfect 2"),
    CHARLOTTESWEB_2("50e0845554fb49e8aec0400a2d3a887d", "a26f2b03-bf38-4bcc-aadb-ef58d8094cca", "Charlotte’s Web"),
    CHARLOTTESWEB_3("3c8ed72a7a1342d4815472f61ef3b8a7", "33ee5be8-2966-458f-9bfc-086c2d07d72e", "Charlotte’s Web"),
    DHOOM("b46534e593d14b5b981fe95ae85927ae", "abe0c6c4-d923-4e7c-b2eb-95f6ac9efa61", "Dhoom 2"),
    PITCHPERFECT_1("9fa7e176004946ada7b427d55ab00f84", "3caed118-c0ba-4c0f-937f-1d0e2c2f9c19", "Pitch Perfect "),
    MUPPETMOJIS_1("1d50e17c237a42b790f5dfc04e80eeff", "dfaa8a50-68e9-4de0-bcea-899363e4faad", "Muppet Mojis"),
    PITCHPERFECT_2("087a04d21c224dd58fe56216443d7180", "87b49633-52c6-4b28-8b27-0239cb88b9bf", "Pitch Perfect 2"),
    DESPICABLEME_5("ef8a8e4599ca4591a96a67f23c23abd1", "e95eeafb-ebf8-4a35-9b31-ebc6bdb0f755", "Despicable Me 2"),
    BRIDESMAIDS_1("aab6f9f60c2d427f9e3293727fb7fc40", "6e10d8af-9953-42f4-9c2f-298b6d20f172", "Bridesmaids"),
    THEMUPPETS_1("afc2f134cf094b4086cae7010a7b35ff", "08b1f839-307c-4683-9d43-cec23c648fa5", "The Muppets"),
    CHARLOTTESWEB_4("69f21be31cf94ed296948811fef9eee6", "711be916-ef75-4bfe-89fe-e82da19256f8", "Charlotte’s Web"),
    THENAKEDGUN("018d6e3dfe93464c8343665a2788b444", "4983f3af-e5ee-4a9d-b61b-32e1bf835684", "The Naked Gun"),
    TED_1("69c61b763cf24f33842087b215b019b7", "be80e610-4e80-4d5b-8d1c-7de16258f495", "Ted"),
    DESPICABLEME_6("6f9f3a6733934430adb33998b2267b5e", "af73a986-efd5-4455-bd4a-d2f48647765c", "Despicable Me 2"),
    FAWLTYTOWERS("dde399f2a6214fee813682cee9b9598b", "038a7f5d-186a-4d60-8020-d82f9432b819", "Fawlty Towers "),
    HOUSEFULL("17f3d267617b46c7ae735a2b31a332f2", "a8b13ab4-dea0-4774-8272-a1e5586a037a", "Housefull"),
    HOUSEFULL_1("9fcd7c6dc5a44aaea0533151f5dbea3a", "a168f582-cb9d-4155-a499-9f1618388b69", "Housefull"),
    IMALANPARTRIDGE("36766083cdbc4a34aeaa0f1522c87c24", "82ac134e-c2e6-48c6-9796-c29198490d73", "I'm Alan Partridge "),
    FURIOUS_1("f151d7e619e143d1a618cec1d0e4dbb3", "e5c6c1f0-05b1-438f-8634-998b45ccd467", "Furious 7"),
    FURIOUS_2("d7732e277d9340b0b7d751123bdece60", "71b15159-9e16-4980-b4b1-3ade5c30347a", "Furious 7"),
    FURIOUS_3("73e4d181df7c414495adbb01be6009b7", "abfdd2ac-60ba-4535-92be-2a6151b20caa", "Furious 7"),
    FURIOUS_4("c4cb2bc1341f4635b2a4e7d0351d61b9", "330a8ac2-de14-413e-b779-d8c90ef625db", "Furious 7"),
    PITCHPERFECT_3("068ec3fce73942b295a2c6648a21cbd0", "866ea56e-f208-4708-baaa-679cd099a10e", "Pitch Perfect 2"),
    PITCHPERFECT_4("f8bf1de3fb7344318e597442bd467a7f", "2496e9f3-0f65-44b9-8087-2ad26304c9a4", "Pitch Perfect 2"),
    PITCHPERFECT_5("bfe4cc6214554248ae40cb7df006ecf9", "70994c1b-5173-4ddb-9a30-0663a5b0a595", "Pitch Perfect 2"),
    PITCHPERFECT_6("dad596b03d8a4663840e6dba4b20b5de", "14c75874-c363-478d-8a78-79e939203fed", "Pitch Perfect 2"),
    PITCHPERFECT_7("198fbdccb32b47f3a88c03cd614d800a", "088ce08d-74c0-4793-9368-d058cfed0eb5", "Pitch Perfect 2"),
    THEYEAROLDVIRGIN_1("26079dae03f645d0af564ac6b05a0b02", "fe3ccd1a-d25a-41d9-b06f-5fe6fb1a1b20", "The 40 Year Old Virgin"),
    THEYEAROLDVIRGIN_2("a98d26d04b514b5ba0ca2a7a589204f4", "efef89b2-208d-4692-b83d-11485c521117", "The 40 Year Old Virgin"),
    CHARLOTTESWEB_5("c2ce4e05fe7b4ecdaf7b6f3d131cdfcf", "a94897f4-cf25-4696-8589-d75347421012", "Charlotte’s Web"),
    CHARLOTTESWEB_6("df1ac6a01d254d299d6dcb658f80b988", "22082a74-0759-42ef-b899-2a1645b3f6a2", "Charlotte’s Web"),
    CHARLOTTESWEB_7("f3634673206a48ba926028a28df17bae", "431019d8-cd05-4bc3-b57f-945aa1cc115a", "Charlotte’s Web"),
    CHARLOTTESWEB_8("b38a38bd87904805bef98d6e2ae9f29d", "fcf3876d-79fe-4eef-8511-7149a4e02f73", "Charlotte’s Web"),
    THEUNTOUCHABLES("8147f3269a644eb1953bdf2d61c39096", "ef5b0785-055a-49cb-a35f-b177334e8a5c", "The Untouchables"),
    CLUELESS("3f29334b042e447eb9af000b2629c8d3", "508e081c-9042-439c-a714-a2350d094268", "Clueless"),
    CLUELESS_1("e4bad767389547da8009a666141acf6e", "8e7bde81-de64-4b2e-96fa-1b0620c75ab9", "Clueless"),
    CLUELESS_2("19b45c6be4144bcdb42aab26acdfb7bf", "fc7de293-83f3-424a-9a7a-3b2610426b4a", "Clueless"),
    MEANGIRLS("877d4b1da5bc4a0e9bf9a2acbbd205bb", "c0fb683d-ce18-4d66-a235-9e7717ca9b31", "Mean Girls"),
    MEANGIRLS_1("66b45d9d37544a9ca3523cb01f19d87f", "58304ba3-ce48-4033-b72f-20c6331a49fb", "Mean Girls"),
    MEANGIRLS_2("31667574172c41c0a445a3fd80eea5c4", "4ae24e86-6b45-476e-b7c2-921dbedb844b", "Mean Girls "),
    ROADTRIP("88f1741c067d452a86a8c15773ca7f08", "3569931f-f34d-4bf1-8257-1c899666e41f", "Road Trip"),
    ROADTRIP_1("c8a3852cc0c9471eaf69b651b90af4e0", "e7256b93-e668-4d27-875d-e18fe765590e", "Road Trip"),
    ROADTRIP_2("544bbb9a78a94ca28ac5c4a6bf130b3c", "ccdf24dd-507c-499e-b5e1-1ccf8a82cd7c", "Road Trip"),
    FERRISBUELLERSDAYOFF("851b29bf74cb46bc8648326c6fca19c1", "367d1e3f-f576-46b5-aafe-49c324d57423", "Ferris Bueller's Day Off"),
    FORRESTGUMP("1c480aaaf6cd464598c6554bbb5fc665", "b96655c2-7e0e-4759-a6a7-1260c04e120c", "Forrest Gump"),
    FORRESTGUMP_1("93fc3e921ff24ab4bbf3030c7e39b21d", "186e2aec-e5e4-4bd4-b834-4fa574999fe6", "Forrest Gump"),
    AIRPLANE("f4508ed29ba34193a9862e88ab97e7d8", "0aa8b7e2-b74d-44e6-8acf-e5ab92e1428a", "Airplane"),
    THENAKEDGUN_1("f3e49d8a4ddd4058a508fd97f223cba3", "aced7a67-165f-4620-b4d9-ae3d9395737f", "The Naked Gun "),
    DESPICABLEME_7("c411719f0acc43be9298e97e65f39e1a", "cccdd125-8f49-4f80-9a88-b4457b183188", "Despicable Me"),
    DESPICABLEME_8("5353c297f3ca4d719da9d8b31aba6535", "e1e27c5b-ee65-458d-9d3f-59290ce19f7d", "Despicable Me"),
    DESPICABLEME_9("b0dcbe3c400748f6b1a9ed41c7165b9b", "4f519a3f-cb26-4040-97a0-f7c9e8c7b49d", "Despicable Me 2"),
    NEIGHBORS("6bd5eeed008041019417e188a4b148a4", "e1b2808a-a092-4d58-abe1-362bf8f61051", "Neighbors "),
    NEIGHBORS_1("5d68ea19aa6447e6b340472ea2200f7a", "cace5b2e-6bc3-4387-b1d2-89aee21a43e7", "Neighbors"),
    NEIGHBORS_2("dcb26e29101c4095bee0213d6a1d7364", "9543cd04-3ab4-4a5e-a71d-e7d1d7a908a9", "Neighbors"),
    RIDEALONG("317ea62a11bc4124a5cfdf8dcdb16646", "8e18dec3-8dc3-400e-b5d0-2464f8a2a771", "Ride Along"),
    RIDEALONG_1("ed0042bee89d41169420f95306a72b6f", "ef5aed69-af49-4a90-b65e-bd023d1234c6", "Ride Along"),
    BRIDESMAIDS_2("24b8a8a7075945348d76da9a384761cc", "2a4185b5-1e5d-4927-8cb7-fb0a3083b295", "Bridesmaids "),
    BRIDESMAIDS_3("18a0bbf594544f098b0c6fcab4f507a1", "83e04bcc-e7fc-4b33-bcec-745cb53fa3ae", "Bridesmaids"),
    BRIDESMAIDS_4("d4f0a0abf1744579b50d0c4b653af9dc", "ad551a41-033c-4f72-b266-eec9a8498a8c", "Bridesmaids"),
    PITCHPERFECT_8("b38dec16e4f84aa9b22b476a91e995f9", "07d63434-e47f-4c2c-9320-d7031377b887", "Pitch Perfect"),
    PITCHPERFECT_9("80754c00d9794143935e04c81fc8b963", "5439ff08-30c0-46b6-b77d-9fb997c939f3", "Pitch Perfect"),
    PITCHPERFECT_10("ec02036955814aecb6585dd9c724761c", "159ce0e8-627f-41a9-8bd2-17e82e604e48", "Pitch Perfect"),
    PITCHPERFECT_11("0d69ebd47a6f49e5ada1da7ffa00b856", "832cd3b4-407e-438f-aac4-3af29831c8f5", "Pitch Perfect"),
    TED_2("5d13593dbcf54ebfb625392eafc920f1", "70ba8f35-6440-4066-a531-838204a98b61", "Ted"),
    TED_3("18e8582c098a432fba8c84f2697f15a8", "302308fa-5794-4386-9854-cdbe3eb2904c", "Ted"),
    TED_4("e672e395930249b9aaa3cdc384c853d7", "6c6303a6-40f1-4d7b-b773-e7948bfa4230", "Ted"),
    MEETJOEBLACK("7d46d6bb109940448188957804896023", "51c786aa-29ef-4141-bbe3-29f2b8bb6fd9", "Meet Joe Black"),
    FORGETTINGSARAHMARSHALL("5c3501f77c3749cd865967a38788b7c6", "22f31a8c-8387-478a-a43d-868f6b58e4a7", "Forgetting Sarah Marshall"),
    APOLLO("29735e6373f6412fbfdd391f983583c6", "36c23eae-4fbc-4f38-b9d2-762d971d8685", "Apollo 13"),
    KINGKONG("085d92fc41f941a4b5901b0a9b11e56d", "f002101c-9afc-481f-b171-09b1737e16c5", "King Kong"),
    THEHULK("d308008edefb4f6db33565110a3dc726", "a240eb85-5818-4768-b227-4e55e700af60", "The Hulk"),
    BACKTOTHEFUTURE("4168e0a4bae049a6967a8153836344fb", "4e7df5fa-1a8b-49ea-9503-062c7e26780b", "Back to the Future 2"),
    BACKTOTHEFUTURE_1("5d1f2cf5cbbc484e97e3769411f17ebc", "0e8516f0-b23c-4274-80a9-41bc2923f14f", "Back to the Future 2"),
    BACKTOTHEFUTURE_2("ff16e2db67a14e9786dc490cc3a9ffc0", "c9c1011b-4607-4e12-baec-523a21b1f63d", "Back to the Future 2"),
    BACKTOTHEFUTUREPARTII("60ad40749bea4cd299e4d69e1366fd51", "4b0a3d58-25cc-4693-b643-57128eafeb27", "Back to the Future - Part II"),
    BACKTOTHEFUTUREPARTII_1("4bde048c03cd42d79ea3dff066cf327f", "32db0c0e-7e2a-41cb-b436-89b7638f36a0", "Back to the Future - Part II"),
    UNCLEBUCK("c86bcb7d002d49d088d290c798cbc19f", "f22232c2-3212-4f38-ad64-010c686d1948", "Uncle Buck"),
    UNCLEBUCK_1("2b5730f13bac4a4b9db792cc548b9399", "b3c72b66-1ada-46c2-a7e5-58013f465372", "Uncle Buck"),
    THENUTTYPROFESSOR("eae4a4725be24c6d81379fcf0625ade6", "64e8c17c-30df-44d7-8347-5900f22d8429", "The Nutty Professor"),
    LIARLIAR("21b450ad3d9044aab9647232395ebb1d", "b0dbbd78-359c-45ee-99da-f10f6bdeebb1", "Liar Liar"),
    LIARLIAR_1("d2ad3b06055a4da2aca40e4cd9782cbb", "aaa8054a-efd2-4af6-9f45-447e0d62fdce", "Liar Liar"),
    LIARLIAR_2("62c36fc5330644cc8889617695683f8c", "99c0f13b-156b-4d12-81dd-ad2ab9380c45", "Liar Liar"),
    KINDERGARTENCOP("9d3072e8dbc240c8946a1c019b1cb883", "643a6521-ca41-4a1e-82ee-daa88e3a75a1", "Kindergarten Cop"),
    KINDERGARTENCOP_1("32921f0494934b228d86d1cee449d91d", "c5186933-5aa3-45a5-94b0-408d667e6811", "Kindergarten Cop"),
    HAPPYGILMORE("6c627adc5d7640e4b42189b282392d88", "1135a8e0-d31b-4df4-a92f-384cf1574d29", "Happy Gilmore"),
    HAPPYGILMORE_1("d521b47bb72542ad8d34ed1893d17477", "25c3c63e-bbb9-4316-8b2b-f93c115c6636", "Happy Gilmore"),
    HAPPYGILMORE_2("6638d01f0087481e8cfaf11dab69f400", "e3d525fe-c3a1-4b28-8d40-a77956c3d597", "Happy Gilmore"),
    HAPPYGILMORE_3("dd00d2bf40c94a43ab28f8364330cfa4", "227c70b4-be2e-42f4-a276-5d32dd29cacb", "Happy Gilmore"),
    SCENTOFAWOMAN("5c463408a90147848794ec94b1d8c8c2", "8bdd624f-cd0e-4792-a39c-5e94e68767e5", "Scent of a Woman"),
    FAWLTYTOWERS_1("742225f3e6ad495e9b4ecf560a13dbcf", "a4eea952-9fc5-450b-82c9-2c169338fa0a", "Fawlty Towers "),
    FAWLTYTOWERS_2("9e1451cdcce3475691fe4f8d26764abb", "7e4d48c3-59b4-4670-9465-47f96872b7d0", "Fawlty Towers "),
    FAWLTYTOWERS_3("d32b43aee57f458196aea42cbb81d138", "3e68dec8-0940-41d2-aba2-b4b24e877e82", "Fawlty Towers "),
    FAWLTYTOWERS_4("487097612f5646e4a04d10ca5894385e", "8c5b84a7-d989-487d-b1f1-6bdfe54a4b31", "Fawlty Towers "),
    IMALANPARTRIDGE_1("ce218d32cd1343d4ac8846870e889b9a", "6f23df50-ea38-446e-a272-32ca341f31b0", "I'm Alan Partridge "),
    IMALANPARTRIDGE_2("d93a6a3f4f4c494d994b3bcc81dbb451", "e61723e0-b670-4415-a2e3-197dd0e48f77", "I'm Alan Partridge "),
    IMALANPARTRIDGE_3("3e4e6b4255b74985b774153abc3d1279", "1d2191a7-2888-4601-94d6-42a52a1a6416", "I'm Alan Partridge "),
    SHERLOCKHOLMES("96238a3d9b2a474ca221a424304df396", "a34e6bbe-db6d-48af-bece-fbebecfca599", "Sherlock Holmes"),
    SHERLOCKHOLMES_1("dd438f90b1b341a298ce36fb6be5b035", "7d5e0fdc-3575-47f0-b2c5-30340ac9f71f", "Sherlock Holmes"),
    SHERLOCKHOLMES_2("de15e86d28604b59b6931fee09b02b53", "629255cc-4a5e-4250-ac86-0544f0fe2f1e", "Sherlock Holmes"),
    SHERLOCKHOLMES_3("7842b2fb4a4e4cc6a37c38f294ea8b68", "e5ee02ab-327b-4d31-ae9e-58223847f11c", "Sherlock Holmes"),
    SHERLOCKHOLMES_4("fac4476b01874b42b548444efd20cf4d", "268f43d0-df89-4cfd-930e-9eb35bf5fe0e", "Sherlock Holmes"),
    SHERLOCKHOLMES_5("1ba821ce901940cf869b3b1f27bd683b", "3ea3a565-0a61-4eb9-9fd2-6f19c80e6318", "Sherlock Holmes"),
    SHERLOCKHOLMES_6("b5632b247b024535ad62132f015856fa", "d1bc696f-73e0-46ba-88db-6a183bf22ef9", "Sherlock Holmes"),
    SHERLOCKHOLMES_7("9c5738764fb646d19143c08003d0a4e8", "8e6b95db-1b2c-4fa2-be80-44b19a98b4fa", "Sherlock Holmes"),
    SHERLOCK_1("7cb4d37b5d3d4c62b96ff89cd522bfa0", "2f67279d-84c3-4a1f-9e25-84f4a587cd74", "Sherlock "),
    SHERLOCK_2("7e5e6bb28942428593892d6865ccd47a", "6ebe851e-0b9b-4980-9099-41e2f411960f", "Sherlock "),
    SHERLOCK_3("1ac7f76a8f144a13a1b00fc8b69f12e1", "5151470d-7e5c-461a-9cf6-5247960a9651", "Sherlock"),
    SHERLOCK_4("b5f8f2ac9300467fb7f56363975ce6bf", "b01fb4f9-e524-44d9-8a3e-2c7ae4916645", "Sherlock"),
    THEOFFICE_1("f521869a6990471593ea264236a80994", "44efacd5-8307-469f-a9a9-f63424c7d4c1", "The Office"),
    THEOFFICE_2("276345f4154b44eba35c6aec7f6b5c4d", "d66e891c-6a73-4c01-8059-da4c1c25795b", "The Office"),
    THEOFFICE_3("08bc1e3232d9491c9b70372c36dfca48", "c9a457dd-f328-4a1e-9ebe-7f54cf57f956", "The Office"),
    THEOFFICE_4("f505f4ae7607433b9be05347d502a6ff", "949182ad-871b-433a-8039-2eb5d0408b46", "The Office"),
    THEOFFICE_5("ad84d1e5c0674ab3b7dde50642bd2d65", "db446598-6fa2-4c93-93ef-255186f422f6", "The Office"),
    THEOFFICE_6("36cd46e92b3b446f8618b50ea89fe4ee", "e998981f-d265-40b2-afef-9d3cca21c9c5", "The Office"),
    THEOFFICE_7("ec0ff611b69d4eec95e84ddc36ae1645", "2964acda-a44f-47af-86a1-aefe6891e300", "The Office"),
    DRWHO("aaa6e784e4354f2985abb054d1399814", "4d9172aa-a81f-41cf-80f0-97bf703566ce", "Dr Who"),
    DRWHO_1("f3a6a95ddde24edd985702b0cdddb7c1", "9b8cb147-29c1-4fc1-866d-ff436b1326d3", "Dr Who"),
    DOCTORWHO("28a9c5b70f534aadb10bd115b2142b06", "8b1af8dd-a4eb-4f86-b6c7-ac0b0475193f", "Doctor Who"),
    DOCTORWHO_1("3db29e70f2c049da816ddba8255c57db", "ca4124a7-4b81-48ed-9370-334362d266ea", "Doctor Who"),
    DOCTORWHO_2("ad8727db9dca4c198bc8dc72b297c32e", "101b3a7d-07ed-4456-9680-54517166d4a4", "Doctor Who"),
    DOCTORWHO_3("50c6a194d6564ce4a0c246b11791e906", "81d031a3-e528-4296-9fb4-7e3bd7c77965", "Doctor Who"),
    DOCTORWHO_4("6c689df080cf4d1b892c222727e19bfa", "f79a37a2-cd49-4a50-8819-567ee58e14ee", "Doctor Who"),
    DOCTORWHO_5("0e29b74d0b004f44940ff0d70a53870e", "8db9b130-8afa-4e58-ac92-767b8320050f", "Doctor Who"),
    DOCTORWHO_6("c8dd8f17eda04ba0b7809b01cc777b50", "548a3ee0-69d0-48b0-b3f6-c43942492c92", "Doctor Who"),
    DOCTORWHO_7("dfa73954408b42f6a90ac16f290fc503", "5c9429a0-6a21-42d2-83d5-a8089c015b3a", "Doctor Who"),
    DOCTORWHO_8("328f3c97b1224e568e30126f1cb9fcab", "b959d9e3-efcf-4114-aeda-903a948be16f", "Doctor Who"),
    DOCTORWHO_9("bb4f53d473864d92a39c1ce18427d37a", "fc1c93e0-ce59-47d1-8556-fe535f4e487d", "Doctor Who"),
    DOCTORWHO_10("3481cdde5e6b4318bb7e421b69b00d49", "b741af8c-c9f4-400a-a84e-e42bc4884411", "Doctor Who"),
    DOCTORWHO_11("7d771ce4817945a2a0c4219c3270380d", "e87c0b88-0d5d-419a-82f2-bd33f58b8829", "Doctor Who"),
    TOPGEAR("011a27f7373f4e4e88e7cab229b37519", "e5117bec-add4-4d86-8bbe-26325b73b852", "Top Gear"),
    TOPGEAR_1("87b6db6402274089be75f9671d9b6185", "7eebf265-5799-49fd-a807-77476bd62d4f", "Top Gear"),
    TOPGEAR_2("6a22537eccd1457f8ce0a23f290d80a2", "6768c861-63ee-4045-bfe1-c399e8159237", "Top Gear"),
    TOPGEAR_3("d301ac1eeccb4016a776694a0bf89e1b", "ddd2b8bc-e2dd-40b2-a4eb-b36d6cc4165f", "Top Gear"),
    TOPGEAR_4("d9d35366354247119d4e3c24c77dafc9", "8e1a6cef-5390-42df-a975-ab0fb5a75902", "Top Gear "),
    TOPGEAR_5("43e0a41f61fe449d86c9f8ab76d31d14", "a0e98e3d-c663-4fa3-ad50-c2f642f644cb", "Top Gear"),
    TOPGEAR_6("117c82605fac4660906e6375ba3f19a1", "cfdc2236-efbb-4430-bd1d-59b63a92cc35", "Top Gear"),
    TOPGEAR_7("daa2eff780c6427391cd0e650f8f3051", "2ffc046e-5f79-4422-9d1a-990cdb3c5c27", "Top Gear"),
    TOPGEAR_8("fc02274647f44f74be05ceb790e159e3", "2bfe76b9-b281-4f8d-88ee-2a8f820df316", "Top Gear"),
    TOPGEAR_9("83349a8466f244f7a0d50eb93be29a48", "41bdb1e8-a7d0-4348-821c-50cff6dcf791", "Top Gear"),
    TOPGEAR_10("c63149abd4d443b2b2b6d347634bd1a4", "9a670842-96e0-4056-975a-29115f697058", "Top Gear"),
    TOPGEAR_11("60990c0788ab422aa32f050b64a5a469", "acadbe76-e38a-40c9-a3ba-6c53f353a7f3", "Top Gear"),
    TOPGEAR_12("8e59bf1aca0f438fa383d918df2197cc", "fa894307-b143-47db-a83e-f824a3173c3e", "Top Gear"),
    THEMUPPETSMOSTWANTED("62e6ed0de2264798a473384a40cda518", "c06b4c86-8f5a-4c77-ae2f-f5a4b927d2cf", "The Muppets Most Wanted "),
    THEMUPPETSMOSTWANTED_1("d474707cee1742fcba2f344d0929adaa", "7cb0f5ee-5044-4c1c-a2ff-8857f5ae616a", "The Muppets Most Wanted "),
    THEMUPPETSMOSTWANTED_2("45f93f34dee74519b1ed177dd857e115", "d5dd61d8-1e09-4a80-87da-d1eb807085b6", "The Muppets Most Wanted "),
    THEMUPPETSMOSTWANTED_3("c814b1befd1e4f1ab08e12eb77e8df1e", "6b7cd38b-78f3-457a-9362-2119e591a71d", "The Muppets Most Wanted "),
    THEMUPPETS_2("fe0a7a51fa214b46acfec1314422ecf5", "25874031-288f-4751-8667-6f681ba96a51", "The Muppets"),
    THEMUPPETS_3("7b8ea456196b458782eecf079d5f9e6f", "9aa3ea28-9686-4f97-abd9-98450f37ce80", "The Muppets"),
    THEMUPPETS_4("cc0cb1db07944c34ac35b8cbf733c033", "21c41257-f99a-4da6-b825-0c1554a49975", "The Muppets"),
    THEMUPPETS_5("16eacc425c5c400bae2fbd9b8d56e276", "edd7ec2f-7728-44b2-b075-d2d530083293", "The Muppets"),
    MUPPETMOJIS_2("6523b3e2579f4db998e003ed35ea554c", "d4292514-814f-4ae0-9128-8fd7d4e8b08e", "Muppet Mojis"),
    MUPPETMOJIS_3("d2e655aa6fa9429387c93bee4ba116f9", "f4202ab1-7d35-4755-b0e6-0eb57b2e3c41", "Muppet Mojis"),
    MUPPETMOJIS_4("edc644ef4d154a21b78bc77303940a83", "5a596ce8-b091-41e1-a9cb-fe13c5c573d7", "Muppet Mojis"),
    MUPPETMOJIS_5("1024df6ae4b349389825ab6a5e1ea630", "5c797488-83dc-44d1-87b9-61bb88b7f988", "Muppet Mojis"),
    MUPPETMOJIS_6("ef6caa4dd3e745b4b251062b62083a66", "7de74d6e-e947-478c-85cf-d0c5b0cfd907", "Muppet Mojis"),
    MUPPETMOJIS_7("08ae7728a0864275930c79f8ad03babf", "cde33dae-8cff-40e8-984e-ac5876e51b85", "Muppet Mojis"),
    MUPPETMOJIS_8("0287450992264189888dd11b8f3562c4", "7652efe5-0f81-4659-99a4-4c06c7c8e522", "Muppet Mojis"),
    MUPPETMOJIS_9("fd97a5440a9d40b09c785307839e0fd3", "ba5002d1-533a-41e0-a639-7dd4a6a9290b", "Muppet Mojis"),
    MUPPETMOJIS_10("7a2997b52076474494f80485b38e2661", "c6c54324-4beb-4e03-aaec-168043f339de", "Muppet Mojis"),
    MUPPETMOJIS_11("b64d0223850649ee8d40446e420b9367", "56eef533-8d26-4b1b-b6c7-22a63461786a", "Muppet Mojis"),
    MUPPETMOJIS_12("583342f7bec24ae987702e053131e6d6", "828b28b4-a480-48a0-8428-ceae59771e6b", "Muppet Mojis"),
    MUPPETMOJIS_13("e5b9f3c4d39e49208c5aebd62304ce20", "5930c3dc-909d-4761-a3d6-b174a6464fc2", "Muppet Mojis"),
    MUPPETMOJIS_14("3ff5d7ba92fe4865b7f8dbd1167cfc25", "2f0d5e95-39c0-4f08-bca1-11aefb76c9fe", "Muppet Mojis"),
    MUPPETMOJIS_15("b7d97b8d956748e5915a0608994769eb", "b33dc797-642f-47e4-ac34-1085690b4e8d", "Muppet Mojis"),
    MUPPETMOJIS_16("3d6eda6657ea4eae96c0f3bba4430cbb", "d3ec62f6-ffb2-48ad-96df-622157224cc0", "Muppet Mojis"),
    MUPPETMOJIS_17("29c683b1971c4701877061d0f151d34e", "ea62b5b5-2221-4b4f-985a-731aecadde03", "Muppet Mojis"),
    MUPPETMOJIS_18("752052f22dd74465bca41b9381e77bf3", "eddeb774-b8d5-4d2b-be5b-6fe92c61ffe2", "Muppet Mojis"),
    MUPPETMOJIS_19("402309be9cd64f1590281243f0df2bcd", "95e40e5c-aa0e-45b6-a286-f740a5548e65", "Muppet Mojis"),
    MUPPETMOJIS_20("18920791e75248a4b5e901e97eed384c", "b54cbece-e9fe-461e-8b9c-b568e31d3d77", "Muppet Mojis"),
    MUPPETMOJIS_21("55fb098c3ebb4806b22fa2ad8eb20ed8", "54d4a0e7-5b04-4f14-82a7-efb7b7a894a1", "Muppet Mojis"),
    MUPPETMOJIS_22("9f187cb8b8c24f769ec0ad63eec3b0d3", "203a3353-bc62-4e88-b6ce-afa33271998d", "Muppet Mojis"),
    MUPPETMOJIS_23("2044a43821ba4f2b9aea11e39458e1f5", "e8d5a954-43fa-4122-b447-682fbe9598ee", "Muppet Mojis"),
    MUPPETMOJIS_24("d65cfa0131e345ebbf9353d7a9336758", "58d2b090-4cbf-4d5f-852c-e8d1ff948653", "Muppet Mojis"),
    MUPPETMOJIS_25("1596aadf0a964f4dbc900ba42accdb38", "70635e3e-0329-40e4-8d6e-c2e2faefba8f", "Muppet Mojis"),
    MUPPETMOJIS_26("634fc06475d5444bb8410c70b7284a28", "e9e4e0ef-43ca-4d52-a4af-e98255ff328d", "Muppet Mojis"),
    MUPPETMOJIS_27("77a4556bd01e4f83a0e5446c1c5ab411", "2ad67319-b453-47ca-8cf2-96b8fe79ba13", "Muppet Mojis"),
    MUPPETMOJIS_28("071e5c78e7654c4398acb25c207547ea", "669afbba-edcd-4025-99f5-c11372cedea1", "Muppet Mojis"),
    MUPPETMOJIS_29("c58c83c624d5428fadfe61b7a41c5c34", "8bb0a289-cffd-45c7-b650-0cc9e405b8b4", "Muppet Mojis"),
    MUPPETMOJIS_30("a2b1fa8acece459aa30102b65246e2a2", "01bdb244-41e4-4874-ac9b-f5d8130ebe67", "Muppet Mojis"),
    MUPPETMOJIS_31("44abd854b2bf46a8a553307acb8663d7", "21e0fb5f-b616-4651-a01d-a5ec5f1292b4", "Muppet Mojis"),
    MUPPETMOJIS_32("a076d7f256324cd9a6c864d4128b4878", "1358f261-3da1-4db1-944a-0d16a19d0fc3", "Muppet Mojis"),
    MUPPETMOJIS_33("e124e7eec6cb4c1c8c2de86c6225a865", "49624691-a253-402f-a3b1-b1612b11262d", "Muppet Mojis"),
    MUPPETMOJIS_34("84956d2880b843929b58c896091df4da", "8cf635c2-90f0-4e1f-9df9-1a7c1c114901", "Muppet Mojis"),
    MUPPETMOJIS_35("58e8987f1e23493f9a8fb563b272028c", "23f5a11b-b821-4d65-a9c5-f5e21c651b19", "Muppet Mojis"),
    MUPPETMOJIS_36("e511b5cce8064d4eae55cb5048d5d0a0", "b80755ad-ca52-4317-81cb-71187cc1d122", "Muppet Mojis"),
    MUPPETMOJIS_37("a5b3457e5ff24e009daa55a57361eac2", "56767f45-2d35-4ffd-8748-fcf4417df86f", "Muppet Mojis"),
    MUPPETMOJIS_38("62086834e5a347fabe39c9ad67af1ce2", "7fdaba4a-e575-4d09-996a-7d15f755f2f6", "Muppet Mojis"),
    MUPPETMOJIS_39("06576e9bfa81420b80d6b504e14970d1", "786e5012-58d3-4c69-8ad6-69ce59dcfb66", "Muppet Mojis"),
    MUPPETMOJIS_40("531b98dca26e48629b26048383dda4fa", "4b28136b-d2ac-4529-9789-43337ef2ec55", "Muppet Mojis"),
    MUPPETMOJIS_41("685a94c6ccb94a50838d18a9880c2474", "17eb8315-8a29-4ac5-9689-14d47e1131bf", "Muppet Mojis"),
    MUPPETMOJIS_42("82e347c3efb941688231cb7ea1554f5d", "69071a4a-2d48-4470-8d7a-4da039d76cf3", "Muppet Mojis"),
    MUPPETMOJIS_43("ab3a7949a6b8472582434b8a75c8cee9", "6edfca65-e39f-4273-8526-a5543d98fb1d", "Muppet Mojis"),
    DHOOM_1("2e5f6b0ee19141998cd3111bb4517c2b", "5a84b387-af09-4d48-b136-5eaaa843f7b4", "Dhoom 3"),
    DHOOM_2("47825593e8b74bb5a2f87dd454f85f03", "49b51bc7-cd53-496c-82b5-dfebd75955ba", "Dhoom 2"),
    RAONE_1("abe16ca68ce34fc780402649a2ffadba", "90a581bd-6981-47a4-b857-52e624747d60", "Ra.One"),
    BACHNAAEHASEENO("641e936e6d42470997a123f0104583b0", "b400166d-6819-40ec-8277-e9d27a08b4f7", "Bachna Ae Haseeno"),
    DILWALEDULHANIALEJAYENGE("8474291a13ce462bb66e17f69af47ceb", "9901baf5-debc-4943-b9eb-74d2777df27a", "Dilwale Dulhania Le Jayenge"),
    RABNEBANADIJODI("d8a0a912d45b404eb4c59c22b40ac0b4", "b45fe085-a63c-4b7d-ad6e-eed527638a9e", "Rab Ne Bana Di Jodi"),
    RABNEBANADIJODI_1("28265af366c74d178646652418701f17", "d770ea9f-b82d-4b22-b3e7-9a439ba13238", "Rab Ne Bana Di Jodi"),
    RAONE_2("7613a8592efc47148f9bfc150a6b48b5", "c189b733-9788-4218-8f40-dca7c7139c48", "Ra.One"),
    RAONE_3("114842e9139044b3831463dc26d8913b", "037f886e-50f9-4bfe-85ba-e95b6de29895", "Ra.One"),
    RAONE_4("6700e034582d4060911d7079679d3662", "6481c136-37ce-46bc-8096-14e6fadcb19b", "Ra.One"),
    RAONE_5("c545080c909e47ea92b34f88a362ceec", "3e4eb7d2-6159-46ba-b481-defcdcd764f2", "Ra.One"),
    DEVDAS("4548f5bf76b942e69a287af5546c95f0", "1c4fc9fd-cbc7-416b-b6dc-6ac162ae74c8", "Devdas"),
    RAONE_6("58ab10487dde44c79264cb5ba058f875", "9fc96d1a-7fb5-40ed-9445-6642fac54797", "Ra.One"),
    CHAKDEINDIA("3d572c3cb23c48a1a0caafd67a5d7a80", "cddbc24e-4e4b-4161-800f-5919ee62425d", "Chak De! India "),
    ALADIN("4672e516f0254bd2bde0ff2fc33a4207", "71446139-4c55-49a7-8f64-6fcd4e4910f7", "Aladin"),
    JHOOMBARABARJHOOM("dd1fc37f6da947e8a3a81e44518f8ba6", "c4461c0a-1801-4a8a-bfcb-9c1bb9519e17", "Jhoom Barabar Jhoom "),
    ALADIN_1("2435594882324033a20ac60fbf7d0451", "c235982f-0fce-4c67-a2a7-6a3386ac3430", "Aladin"),
    ALADIN_2("45aa94aadc2747d49668bcbabb3e5f7e", "e1d87b20-0408-478a-84d3-7c8b51fb2996", "Aladin"),
    KABHIKABHIE("df37bb7e50eb43c0b002e65bd9534ac0", "e0da7fc6-a955-4801-b574-6aef901def37", "Kabhi Kabhie"),
    DHOOM_3("26175a1f7e554ee8bd8d26154a7db961", "f318176f-ca9d-4533-afe9-ac1ec7773ca9", "Dhoom 2"),
    DHOOM_4("ff07eb409d0d4c0b8ecf7056217f4e3c", "bf8f17df-63e5-45d6-b5fa-fca7fc1f1860", "Dhoom 2"),
    DHOOM_5("16c73eeb85b74da9b9156d31e8043605", "8741bbbd-3286-43ac-8d09-6c2d27cada20", "Dhoom 2"),
    DEVDAS_1("283e11e227b6450192b848f18d63874a", "3399c735-cfa4-485f-9374-2681bd4fc9e7", "Devdas"),
    AAJANACHLE("0a5869ff5b50450abae18bcc0954ff62", "0324ac8c-811b-4e05-a147-f75727e8edf6", "Aaja Nachle"),
    DEVDAS_2("4520a01995fd43e4b013e7f2746f5a6f", "202c19d2-b05e-4f90-acc9-989ffa3043e8", "Devdas"),
    TANUWEDSMANURETURNS("4391bc29bcc340e78b163fb7201f7af6", "e18583c4-5f15-4855-8eaf-9281457918d3", "Tanu Weds Manu Returns"),
    TANUWEDSMANURETURNS_1("bd29d3df0669409f95cb1c2d23d95e8f", "e2651889-a878-4e9f-8496-eb991f3c0978", "Tanu Weds Manu Returns"),
    TANUWEDSMANURETURNS_2("623c9749734546c399a36fd289d79dc3", "bf33f977-3476-445b-9360-95dc537c0e07", "Tanu Weds Manu Returns"),
    BANDBAAJABAARAAT("e731523c91184d718be8c149d9301d94", "4fd07f13-b0e8-400a-8fc9-16b5ca8db8e5", "Band Baaja Baaraat"),
    RABNEBANADIJODI_2("052b26edcfb241cf96bb44e5e635c9c3", "38d30040-f808-4903-a2d0-3e1158383eb7", "Rab Ne Bana Di Jodi"),
    MEREBROTHERKIDULHAN("28ec05192f0144e58d8034fee8303170", "06ee9997-ccfb-4da2-8758-162c6d71eb10", "Mere Brother Ki Dulhan"),
    MEREBROTHERKIDULHAN_1("6880383ea15e475f878a45a42dcdde91", "1528d31a-c2c3-4080-87b4-f4eb15d9d0b3", "Mere Brother Ki Dulhan"),
    MEREBROTHERKIDULHAN_2("df82ec9e445646e79815fb05e5dd8061", "0e761f2a-5467-4ab8-91ea-ce0ef6880615", "Mere Brother Ki Dulhan"),
    COCKTAIL("94082d1e719b4f99be18a784fae9d9cd", "afc1550b-d37e-422b-bde3-ee867c591597", "Cocktail "),
    COCKTAIL_1("a9b113a11ec64c61be4333f1253119ee", "ddecf9d7-dcc9-428f-a688-a40c091a6666", "Cocktail "),
    COCKTAIL_2("b38781f9fad9486db951cf47e3e1d574", "74b05edf-a60b-4fcb-bca7-d162efd39399", "Cocktail "),
    VICKYDONOR("5bee463a060d4caea6ff6c13955f8acf", "8237e223-9493-406a-a029-65b6f4620da7", "Vicky Donor"),
    BEWAKOOFIYAAN("26f3a8151a6c4058b690c8d15a9c321f", "64f39fac-668a-46b9-819e-1fa4285c4b67", "Bewakoofiyaan"),
    KILLDIL("2263a949fb0b4351b885b1bf1bd6c823", "dee33ef4-4e2a-4684-ad95-61231b9ed628", "Kill Dil"),
    KILLDIL_1("fb4c5a9100884f4ab7f22251b82cd7f0", "dd4fe723-1892-45dc-9460-412f765ca533", "Kill Dil "),
    KILLDIL_2("05b6ef201a4042d5839a203ed141f60d", "06e5fb00-3e16-419a-aa90-2fc975abf09d", "Kill Dil "),
    BANDBAAJABAARAAT_1("b83a4cadba49421aa87ea5b42b3d4f9a", "a8c3e36a-6551-4bc6-939d-e0896626e175", "Band Baaja Baaraat"),
    KILLDIL_3("0cfc6872ea7a4d3b939bf753ab08d6ed", "1d99a923-c1f9-4124-a09b-71da0f1cac31", "Kill Dil "),
    SHUDDHDESIROMANCE("79126721fc6f4129bd1b4277ae72b821", "23a30542-c976-4232-904d-f75e9260fd71", "Shuddh Desi Romance"),
    SHUDDHDESIROMANCE_1("0e9ae09e92554e4bb464073e40b596f2", "b2c73843-f8af-46e2-92d4-5b23308a5d6a", "Shuddh Desi Romance"),
    ROCKSTAR("c30affea468a44efa2e9e274e6de012e", "841b262a-c96f-4481-bb0a-811f8108a74b", "Rockstar"),
    BACHNAAEHASEENO_1("944ccbe1290f43eea54297526dabc0b4", "c4422ec9-4833-4baf-81fc-2a4bf0de8479", "Bachna Ae Haseeno"),
    HOUSEFULL_2("30c197b4173c4fc09fffbec84a6b366f", "014241e5-602b-4975-ae1b-86daea8a0d86", "Housefull"),
    HOUSEFULL_3("ecfcc40d42c948279d1cd037fb6d9fe4", "1824aefd-d20c-417b-97aa-161d54963466", "Housefull "),
    HOUSEFULL_4("2425c945fdbf4a6ab386304ee74683f0", "5b66a790-fdae-4ccf-aa93-59e0d690fc3c", "Housefull"),
    HOUSEFULL_5("4c7cfb904c7c4902975156bfaf6dee55", "2f513fd9-d1ec-4cde-8b3f-66347b550308", "Housefull"),
    HOUSEFULL_6("7c06975dd0cb46ec9e1040ac3fd3921d", "460bce98-1a16-46bc-b7b8-340913ceacaf", "Housefull "),
    DHOOM_6("ecdeec0e902043049eecae01c65d3b58", "3bcf51cd-ae5d-4687-863f-536ad6cb5cb5", "Dhoom 3"),
    DHOOM_7("1a4a7ba0fc5b4c7bbca494f3be1c4770", "44f3b7d9-18c3-456b-a89c-757953170607", "Dhoom 3"),
    RAONE_7("5c62cde33e61401a921fb5ef9a0c8230", "7d34c527-a88b-45e9-ae03-086ef3d89d54", "Ra.One"),
    GOLMAAL("3249c494bb6e4d7bb241d84b94ca717d", "c0d4ffe8-5c8b-4822-b7d3-489e95706b28", "Golmaal 3"),
    GOLMAAL_1("7217938c39cb4078b0408701ad540c01", "a81a5bbc-f8fc-4151-a8fe-767a01fb0009", "Golmaal 3"),
    BEWAKOOFIYAAN_1("40fc033506c4405890805944885c91a4", "4c4acbf2-fe66-44ac-9103-f9f836caa1c8", "Bewakoofiyaan"),
    BEWAKOOFIYAAN_2("a7cf012a7e514f36a80830ba3bf3e252", "a94bfac5-d2e8-4da2-9d30-078d76a11114", "Bewakoofiyaan"),
    BEWAKOOFIYAAN_3("7bafbc58bb47424eb17eaa31e38d19a7", "428a80cf-6642-4f75-8e6d-5ee3aaeca171", "Bewakoofiyaan"),
    TANUWEDSMANURETURNS_3("fe1cabb2d0d04e6b9f69018aa30fdb9e", "46b8bb35-f0f7-432b-bb7c-e7f25f862c8b", "Tanu Weds Manu Returns"),
    TANUWEDSMANURETURNS_4("19b77628025848c58406abf5880e9dae", "be4ead38-652e-4e38-aa0e-4c1c4dfd89b9", "Tanu Weds Manu Returns"),
    TANUWEDSMANURETURNS_5("89d720a959f747afbd34bb5756e717bc", "ddcdfd61-f67a-4e3a-9518-21a06b9d3ad2", "Tanu Weds Manu Returns"),
    BADLAPUR("f9caa4fa7ade4436ae33d35544274ab3", "e94c2aa3-040f-4bff-849d-042caf002eff", "Badlapur"),
    GOLMAAL_2("f1ac06a05f014159aa791fa1618e43a6", "ee9a5bb9-9755-4a15-ba3b-ab1cb19cc41a", "Golmaal 3"),
    KILLDIL_4("81926f3b46e74ad98ddba90af12e5e40", "45c3ad72-d388-4a23-8480-5fa53601e599", "Kill Dil "),
    DEVDAS_3("9da385b084594df7aadabd752e5ac9f7", "a5ca0a83-2466-4c47-98ed-d523caf61cf0", "Devdas"),
    KILLDIL_5("825473cc486d48b0acf25f52045a21be", "b139d61b-3df8-4440-a1c5-9ef318163181", "Kill Dil "),
    AGENTVINOD("37ef0832a0ac486fa07953c73bf6cee9", "2e4a8407-5931-4930-8ebc-d2e48e0397d3", "Agent Vinod"),
    VICKYDONOR_1("14271874627f4a2d893db568eeff9954", "3c026c7d-aa37-4fe1-8bfb-133460aed512", "Vicky Donor"),
    MOHABBATEIN("b3cffea2fd5044d08db7458e4c373cdf", "5b000c95-f530-4a7f-b302-842675aaa249", "Mohabbatein ");    

    private String id;
    private String etag;
    private String desc;

    DefaultMoji(String id, String etag, String desc) {
        this.id = id;
        this.etag = etag;
        this.desc = desc;
    }

    public String getId() {
        return this.id;
    }

    public String getEtag() {
        return this.etag;
    }

    public String getDescription() {
        return this.desc;
    }

    private static final Map<String, IMoji> fliks = new HashMap<>();

    static {
        for (IMoji flik : values()) {
            fliks.put(flik.getId(), flik);
        }
    }

    public static IMoji getById(String id) {
        return fliks.get(id);
    }
}
