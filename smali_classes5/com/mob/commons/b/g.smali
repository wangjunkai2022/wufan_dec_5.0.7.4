.class public Lcom/mob/commons/b/g;
.super Lcom/mob/commons/b/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/mob/commons/b/h;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected a()Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "036e4fmfhfnfifmfefkhkfnfm2lhg1feXhGfffk:ehNfnijinikgigghngnfjgnikilimgggfik"

    invoke-static {v1}, Lcom/mob/commons/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "015e@fmfhfnBjLfiGf8hiUhAfkfn[jAhifkfe"

    .line 2
    invoke-static {v1}, Lcom/mob/commons/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method public a(Landroid/os/IBinder;)Lcom/mob/commons/b/h$b;
    .locals 8

    const-string v0, "053e:fmfhfnfifmfefkhkfnfmClhg=feUh;fffk7eh>fn\'f8fkfeZiCfnijNlhgIhn hEfffkAeh ggfe@hgk:fkghfkYhMflgnHh(flfffk9eh"

    .line 3
    invoke-static {v0}, Lcom/mob/commons/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v7, Lcom/mob/commons/b/h$b;

    invoke-direct {v7}, Lcom/mob/commons/b/h$b;-><init>()V

    const-string v1, "004:fm^f\'fkfe"

    .line 5
    invoke-static {v1}, Lcom/mob/commons/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v1, 0x0

    new-array v6, v1, [Ljava/lang/String;

    const/4 v5, 0x1

    move-object v1, p0

    move-object v3, p1

    move-object v4, v0

    invoke-virtual/range {v1 .. v6}, Lcom/mob/commons/b/h;->a(Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;I[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v7, Lcom/mob/commons/b/h$b;->a:Ljava/lang/String;

    const-string v1, "024;fkhkhgfkfhfk!k2hffeheflWfeHgjfkVgPglikNgfPhh2ih@fe"

    .line 6
    invoke-static {v1}, Lcom/mob/commons/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {p0, v1, p1, v0, v2}, Lcom/mob/commons/b/h;->a(Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;I)I

    return-object v7
.end method
