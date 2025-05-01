.class Lcom/umeng/analytics/pro/bn$a;
.super Lcom/umeng/analytics/pro/de;
.source "UMEnvelope.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/bn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/umeng/analytics/pro/de<",
        "Lcom/umeng/analytics/pro/bn;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/analytics/pro/de;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/umeng/analytics/pro/bn$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/analytics/pro/bn$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/bn;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->j()Lcom/umeng/analytics/pro/cz;

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->l()Lcom/umeng/analytics/pro/cp;

    move-result-object v0

    .line 4
    iget-byte v1, v0, Lcom/umeng/analytics/pro/cp;->b:B

    if-nez v1, :cond_3

    .line 5
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->k()V

    .line 6
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/bn;->m()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/bn;->p()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 8
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/bn;->s()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 9
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/bn;->G()V

    return-void

    .line 10
    :cond_0
    new-instance p1, Lcom/umeng/analytics/pro/cv;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Required field \'length\' was not found in serialized data! Struct: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/cv;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_1
    new-instance p1, Lcom/umeng/analytics/pro/cv;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Required field \'ts_secs\' was not found in serialized data! Struct: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/cv;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_2
    new-instance p1, Lcom/umeng/analytics/pro/cv;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Required field \'serial_num\' was not found in serialized data! Struct: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/cv;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :cond_3
    iget-short v0, v0, Lcom/umeng/analytics/pro/cp;->c:S

    const/16 v2, 0x8

    const/16 v3, 0xb

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    .line 17
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/cx;->a(Lcom/umeng/analytics/pro/cu;B)V

    goto/16 :goto_1

    :pswitch_0
    if-ne v1, v2, :cond_4

    .line 18
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->w()I

    move-result v0

    iput v0, p2, Lcom/umeng/analytics/pro/bn;->j:I

    .line 19
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/bn;->j(Z)V

    goto/16 :goto_1

    .line 20
    :cond_4
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/cx;->a(Lcom/umeng/analytics/pro/cu;B)V

    goto/16 :goto_1

    :pswitch_1
    if-ne v1, v3, :cond_5

    .line 21
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/analytics/pro/bn;->i:Ljava/lang/String;

    .line 22
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/bn;->i(Z)V

    goto/16 :goto_1

    .line 23
    :cond_5
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/cx;->a(Lcom/umeng/analytics/pro/cu;B)V

    goto/16 :goto_1

    :pswitch_2
    if-ne v1, v3, :cond_6

    .line 24
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/analytics/pro/bn;->h:Ljava/lang/String;

    .line 25
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/bn;->h(Z)V

    goto/16 :goto_1

    .line 26
    :cond_6
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/cx;->a(Lcom/umeng/analytics/pro/cu;B)V

    goto/16 :goto_1

    :pswitch_3
    if-ne v1, v3, :cond_7

    .line 27
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->A()Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    .line 28
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/bn;->g(Z)V

    goto/16 :goto_1

    .line 29
    :cond_7
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/cx;->a(Lcom/umeng/analytics/pro/cu;B)V

    goto :goto_1

    :pswitch_4
    if-ne v1, v2, :cond_8

    .line 30
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->w()I

    move-result v0

    iput v0, p2, Lcom/umeng/analytics/pro/bn;->f:I

    .line 31
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/bn;->f(Z)V

    goto :goto_1

    .line 32
    :cond_8
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/cx;->a(Lcom/umeng/analytics/pro/cu;B)V

    goto :goto_1

    :pswitch_5
    if-ne v1, v2, :cond_9

    .line 33
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->w()I

    move-result v0

    iput v0, p2, Lcom/umeng/analytics/pro/bn;->e:I

    .line 34
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/bn;->e(Z)V

    goto :goto_1

    .line 35
    :cond_9
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/cx;->a(Lcom/umeng/analytics/pro/cu;B)V

    goto :goto_1

    :pswitch_6
    if-ne v1, v2, :cond_a

    .line 36
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->w()I

    move-result v0

    iput v0, p2, Lcom/umeng/analytics/pro/bn;->d:I

    .line 37
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/bn;->d(Z)V

    goto :goto_1

    .line 38
    :cond_a
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/cx;->a(Lcom/umeng/analytics/pro/cu;B)V

    goto :goto_1

    :pswitch_7
    if-ne v1, v3, :cond_b

    .line 39
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/analytics/pro/bn;->c:Ljava/lang/String;

    .line 40
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/bn;->c(Z)V

    goto :goto_1

    .line 41
    :cond_b
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/cx;->a(Lcom/umeng/analytics/pro/cu;B)V

    goto :goto_1

    :pswitch_8
    if-ne v1, v3, :cond_c

    .line 42
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/analytics/pro/bn;->b:Ljava/lang/String;

    .line 43
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/bn;->b(Z)V

    goto :goto_1

    .line 44
    :cond_c
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/cx;->a(Lcom/umeng/analytics/pro/cu;B)V

    goto :goto_1

    :pswitch_9
    if-ne v1, v3, :cond_d

    .line 45
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/analytics/pro/bn;->a:Ljava/lang/String;

    .line 46
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/bn;->a(Z)V

    goto :goto_1

    .line 47
    :cond_d
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/cx;->a(Lcom/umeng/analytics/pro/cu;B)V

    .line 48
    :goto_1
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->m()V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
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

.method public synthetic a(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/bv;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 1
    check-cast p2, Lcom/umeng/analytics/pro/bn;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/bn$a;->b(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/bn;)V

    return-void
.end method

.method public b(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/bn;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 2
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/bn;->G()V

    .line 3
    invoke-static {}, Lcom/umeng/analytics/pro/bn;->H()Lcom/umeng/analytics/pro/cz;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Lcom/umeng/analytics/pro/cz;)V

    .line 4
    iget-object v0, p2, Lcom/umeng/analytics/pro/bn;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lcom/umeng/analytics/pro/bn;->I()Lcom/umeng/analytics/pro/cp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Lcom/umeng/analytics/pro/cp;)V

    .line 6
    iget-object v0, p2, Lcom/umeng/analytics/pro/bn;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->c()V

    .line 8
    :cond_0
    iget-object v0, p2, Lcom/umeng/analytics/pro/bn;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 9
    invoke-static {}, Lcom/umeng/analytics/pro/bn;->J()Lcom/umeng/analytics/pro/cp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Lcom/umeng/analytics/pro/cp;)V

    .line 10
    iget-object v0, p2, Lcom/umeng/analytics/pro/bn;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Ljava/lang/String;)V

    .line 11
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->c()V

    .line 12
    :cond_1
    iget-object v0, p2, Lcom/umeng/analytics/pro/bn;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 13
    invoke-static {}, Lcom/umeng/analytics/pro/bn;->K()Lcom/umeng/analytics/pro/cp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Lcom/umeng/analytics/pro/cp;)V

    .line 14
    iget-object v0, p2, Lcom/umeng/analytics/pro/bn;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->c()V

    .line 16
    :cond_2
    invoke-static {}, Lcom/umeng/analytics/pro/bn;->L()Lcom/umeng/analytics/pro/cp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Lcom/umeng/analytics/pro/cp;)V

    .line 17
    iget v0, p2, Lcom/umeng/analytics/pro/bn;->d:I

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(I)V

    .line 18
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->c()V

    .line 19
    invoke-static {}, Lcom/umeng/analytics/pro/bn;->M()Lcom/umeng/analytics/pro/cp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Lcom/umeng/analytics/pro/cp;)V

    .line 20
    iget v0, p2, Lcom/umeng/analytics/pro/bn;->e:I

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(I)V

    .line 21
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->c()V

    .line 22
    invoke-static {}, Lcom/umeng/analytics/pro/bn;->N()Lcom/umeng/analytics/pro/cp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Lcom/umeng/analytics/pro/cp;)V

    .line 23
    iget v0, p2, Lcom/umeng/analytics/pro/bn;->f:I

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(I)V

    .line 24
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->c()V

    .line 25
    iget-object v0, p2, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_3

    .line 26
    invoke-static {}, Lcom/umeng/analytics/pro/bn;->O()Lcom/umeng/analytics/pro/cp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Lcom/umeng/analytics/pro/cp;)V

    .line 27
    iget-object v0, p2, Lcom/umeng/analytics/pro/bn;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Ljava/nio/ByteBuffer;)V

    .line 28
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->c()V

    .line 29
    :cond_3
    iget-object v0, p2, Lcom/umeng/analytics/pro/bn;->h:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 30
    invoke-static {}, Lcom/umeng/analytics/pro/bn;->P()Lcom/umeng/analytics/pro/cp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Lcom/umeng/analytics/pro/cp;)V

    .line 31
    iget-object v0, p2, Lcom/umeng/analytics/pro/bn;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->c()V

    .line 33
    :cond_4
    iget-object v0, p2, Lcom/umeng/analytics/pro/bn;->i:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 34
    invoke-static {}, Lcom/umeng/analytics/pro/bn;->Q()Lcom/umeng/analytics/pro/cp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Lcom/umeng/analytics/pro/cp;)V

    .line 35
    iget-object v0, p2, Lcom/umeng/analytics/pro/bn;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->c()V

    .line 37
    :cond_5
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/bn;->F()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 38
    invoke-static {}, Lcom/umeng/analytics/pro/bn;->R()Lcom/umeng/analytics/pro/cp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/cu;->a(Lcom/umeng/analytics/pro/cp;)V

    .line 39
    iget p2, p2, Lcom/umeng/analytics/pro/bn;->j:I

    invoke-virtual {p1, p2}, Lcom/umeng/analytics/pro/cu;->a(I)V

    .line 40
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->c()V

    .line 41
    :cond_6
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->d()V

    .line 42
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/cu;->b()V

    return-void
.end method

.method public synthetic b(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/bv;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/cb;
        }
    .end annotation

    .line 1
    check-cast p2, Lcom/umeng/analytics/pro/bn;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/bn$a;->a(Lcom/umeng/analytics/pro/cu;Lcom/umeng/analytics/pro/bn;)V

    return-void
.end method
