.class public Lcom/mob/tools/utils/g;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mob/tools/utils/g$a;
    }
.end annotation


# static fields
.field private static a:Lcom/mob/tools/utils/g;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/mob/tools/utils/g;
    .locals 2

    .line 1
    sget-object v0, Lcom/mob/tools/utils/g;->a:Lcom/mob/tools/utils/g;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/mob/tools/utils/g;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/mob/tools/utils/g;->a:Lcom/mob/tools/utils/g;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/mob/tools/utils/g;

    invoke-direct {v1}, Lcom/mob/tools/utils/g;-><init>()V

    sput-object v1, Lcom/mob/tools/utils/g;->a:Lcom/mob/tools/utils/g;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/mob/tools/utils/g;->a:Lcom/mob/tools/utils/g;

    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 7
    invoke-static {p1}, Lcom/mob/tools/utils/DH$SyncMtd;->getSystemProperties(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private c()Lcom/mob/tools/utils/g$a;
    .locals 6

    const-string v0, "ro.miui.ui.version.code"

    .line 1
    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_17

    const-string v0, "0239djdkdldfdidgdidldgdidldd+fMdjfididk_eRdl!edUdfWf"

    .line 2
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_17

    const-string v0, "ro.miui.internal.storage"

    .line 3
    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v0, "021VdjdkdlffdgdiHgVdcdlddTfHdjfididkFe.dl(fNdfdgdi"

    .line 4
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_16

    const-string v0, "ro.build.hw_emui_api_level"

    .line 5
    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_16

    const-string v0, "ro.confg.hw_systemversion"

    .line 6
    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v0, "026jfUdjfidifiViGdlfiecfidldgfi]f;dlef[g<ecdfVf$dldiYc6dk3e"

    .line 7
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_15

    const-string v0, "0261djdkdldfTfCdigddgdlfi$fiQdg8jVfgdigdNdBdjdcdlef8g!ecdfDf"

    .line 8
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_15

    const-string v0, "018\'djdkdlef9gVecdf^fUdl8jGdgffZg0difiHhfSdc"

    .line 9
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v0, "024cMdkdfdlfiMdZdffidgIe6ejdlfi4jf;ejdldcdifi6dWffZgf"

    .line 10
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_14

    const-string v0, "init.svc.health-hal-2-1-samsung"

    .line 11
    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v0, "024Vdjdkdlffdgdi_g(dcdlddOf_djfididk.eTdldk_jj;dkdjdkdf"

    .line 12
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 13
    sget-object v0, Lcom/mob/tools/utils/g$a;->e:Lcom/mob/tools/utils/g$a;

    return-object v0

    :cond_4
    const-string v0, "027Pdjdkdldddidddkdldkfidlffdgdi4gOdcdldcdifi6jgd2ecdldidc"

    .line 14
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_13

    const-string v0, "018-djdkdldddidddkdldkfidldd(fZdjfididkTe"

    .line 15
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v0, "023)djdkdlJgfiBdddldj?fgfd?fi4fXdldd_f_djfididkMe"

    .line 16
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 17
    sget-object v0, Lcom/mob/tools/utils/g$a;->g:Lcom/mob/tools/utils/g$a;

    return-object v0

    :cond_6
    const-string v0, "022NdjdkdlffdgdiTg[dcdlfi]fe4fiIf+dlddUf]djfididk(e"

    .line 18
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 19
    sget-object v0, Lcom/mob/tools/utils/g$a;->h:Lcom/mob/tools/utils/g$a;

    return-object v0

    :cond_7
    const-string v0, "014de[dcdjdkdidchkejdkdkej;gf"

    .line 20
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "026\'djdkdl<cLdkdfdlejdkdkej9gfQdlHcgAdiDfeiGdidcff@dBfi;f"

    invoke-static {v1}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 21
    sget-object v0, Lcom/mob/tools/utils/g$a;->i:Lcom/mob/tools/utils/g$a;

    return-object v0

    :cond_8
    const-string v0, "020HdjdkdlfidfHdYdj.i*difiKde*dldd!fBdjfididk+e"

    .line 22
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 23
    sget-object v0, Lcom/mob/tools/utils/g$a;->k:Lcom/mob/tools/utils/g$a;

    return-object v0

    :cond_9
    const-string v0, "014 djdkdldjdkdfdldd(f)djfididk=e"

    .line 24
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 25
    sget-object v0, Lcom/mob/tools/utils/g$a;->l:Lcom/mob/tools/utils/g$a;

    return-object v0

    :cond_a
    const-string v0, "020RdjdkdlIcid0dlecdgGe)dkfidldd2f$djfididkTe"

    .line 26
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 27
    sget-object v0, Lcom/mob/tools/utils/g$a;->m:Lcom/mob/tools/utils/g$a;

    return-object v0

    :cond_b
    const-string v0, "018%djdkdlffdgdi)g>dcdldgdidd fPdjfididkMe"

    .line 28
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 29
    sget-object v0, Lcom/mob/tools/utils/g$a;->n:Lcom/mob/tools/utils/g$a;

    return-object v0

    :cond_c
    const-string v0, "023KdjdkdlffdgdiAg[dcdl]e)dgffdi?dRdldjdkdfdlMcBdkdcDf"

    .line 30
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_12

    const-string v0, "015^djdkdlffdgdiUgMdcdldjdkdfdldidc"

    .line 31
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_1

    :cond_d
    const-string v0, "021$fiecfidlMg4ejVf?dl?gLejdfdcdfdhdd)f djfididk]e"

    .line 32
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 33
    sget-object v0, Lcom/mob/tools/utils/g$a;->p:Lcom/mob/tools/utils/g$a;

    return-object v0

    :cond_e
    const-string v0, "019Jdjdkdlffdgdi(gUdcdldcdifiXjgd=ecdldidc"

    .line 34
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    const-string v0, "019PdjdkdlffdgdiOgGdcdldcdifiTjgdRecdldidc"

    .line 35
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "amigo([\\d.]+)[a-zA-Z]*"

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 36
    sget-object v0, Lcom/mob/tools/utils/g$a;->q:Lcom/mob/tools/utils/g$a;

    return-object v0

    .line 37
    :cond_f
    invoke-static {}, Lcom/mob/tools/utils/g$a;->values()[Lcom/mob/tools/utils/g$a;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_11

    aget-object v3, v0, v2

    .line 38
    invoke-virtual {v3}, Lcom/mob/tools/utils/g$a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/mob/tools/utils/DH$SyncMtd;->getManufacturer()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_10

    return-object v3

    :cond_10
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 39
    :cond_11
    sget-object v0, Lcom/mob/tools/utils/g$a;->r:Lcom/mob/tools/utils/g$a;

    return-object v0

    .line 40
    :cond_12
    :goto_1
    sget-object v0, Lcom/mob/tools/utils/g$a;->o:Lcom/mob/tools/utils/g$a;

    return-object v0

    .line 41
    :cond_13
    :goto_2
    sget-object v0, Lcom/mob/tools/utils/g$a;->f:Lcom/mob/tools/utils/g$a;

    return-object v0

    .line 42
    :cond_14
    :goto_3
    sget-object v0, Lcom/mob/tools/utils/g$a;->d:Lcom/mob/tools/utils/g$a;

    return-object v0

    .line 43
    :cond_15
    :goto_4
    sget-object v0, Lcom/mob/tools/utils/g$a;->c:Lcom/mob/tools/utils/g$a;

    return-object v0

    .line 44
    :cond_16
    :goto_5
    sget-object v0, Lcom/mob/tools/utils/g$a;->b:Lcom/mob/tools/utils/g$a;

    return-object v0

    .line 45
    :cond_17
    :goto_6
    sget-object v0, Lcom/mob/tools/utils/g$a;->a:Lcom/mob/tools/utils/g$a;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/mob/tools/utils/g;->c()Lcom/mob/tools/utils/g$a;

    move-result-object v0

    .line 2
    sget-object v1, Lcom/mob/tools/utils/g$1;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    const-string v0, "019(djdkdlffdgdiZg=dcdldcdifi1jgdFecdldidc"

    .line 3
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_0
    const-string v0, "021,fiecfidl0gAej2fAdlZgYejdfdcdfdhddDf[djfididk3e"

    .line 4
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_1
    const-string v0, "023Ddjdkdlffdgdi_gRdcdl e9dgffdiFdCdldjdkdfdlYcSdkdcLf"

    .line 5
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "015)djdkdlffdgdi;g>dcdldjdkdfdldidc"

    .line 7
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_2
    const-string v0, "018=djdkdlffdgdi<gRdcdldgdidd,fMdjfididkGe"

    .line 8
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_3
    const-string v0, "020?djdkdlMcid$dlecdgCe.dkfidldd:f?djfididk@e"

    .line 9
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_4
    const-string v0, "0145djdkdldjdkdfdldd f0djfididk]e"

    .line 10
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_5
    const-string v0, "020;djdkdlfidf,d-dj[iTdifi2de1dldd]fRdjfididk:e"

    .line 11
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_6
    const-string v0, "024%djdkdlffdgdiDg1dcdldd>fBdjfididkTeMdldj;fgfdCfi$f"

    .line 12
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_7
    const-string v0, "022Ddjdkdlffdgdi0g]dcdlfi5fe@fi*fRdldd5f)djfididkJe"

    .line 13
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_8
    const-string v0, "023;djdkdlZgfiJdddldj5fgfd8fi,f[dldd)fPdjfididkZe"

    .line 14
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_9
    const-string v0, "027Gdjdkdldddidddkdldkfidlffdgdi_gRdcdldcdifiDjgd>ecdldidc"

    .line 15
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "018AdjdkdldddidddkdldkfidlddSf(djfididk.e"

    .line 17
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_a
    const-string v0, "024+djdkdlffdgdiGg=dcdldd:fDdjfididk?eMdldk?jjXdkdjdkdf"

    .line 18
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_b
    const-string v0, "028NdjdkdlffdgdiAgRdcdlddGf3djfididkZe+dldiNecOdjUfLdf%feidg"

    .line 19
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_c
    const-string v0, "019PdjdkdlffdgdiIg3dcdldcdifi.jgd7ecdldidc"

    .line 20
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_d
    const-string v0, "021Gdjdkdlffdgdi0g9dcdldd9f5djfididkLeUdl5fGdfdgdi"

    .line 21
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_e
    const-string v0, "023Wdjdkdldfdidgdidldgdidldd.f?djfididk@e2dl*edKdf9f"

    .line 22
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 23
    :cond_0
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "019,djdkdlffdgdiZg$dcdldcdifi3jgd^ecdldidc"

    .line 24
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mob/tools/utils/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
