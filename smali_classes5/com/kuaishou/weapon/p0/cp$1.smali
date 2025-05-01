.class final Lcom/kuaishou/weapon/p0/cp$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/kuaishou/weapon/p0/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kuaishou/weapon/p0/cp;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Z


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kuaishou/weapon/p0/cp$1;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/kuaishou/weapon/p0/cp$1;->b:Landroid/content/Context;

    iput-boolean p3, p0, Lcom/kuaishou/weapon/p0/cp$1;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/kuaishou/weapon/p0/cp$1;->a:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 2
    :try_start_0
    iget-object p1, p0, Lcom/kuaishou/weapon/p0/cp$1;->a:Ljava/lang/String;

    sget-object v0, Lcom/kuaishou/weapon/p0/ck;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kuaishou/weapon/p0/cp$1;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/kuaishou/weapon/p0/df;->a(Landroid/content/Context;)Lcom/kuaishou/weapon/p0/df;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/kuaishou/weapon/p0/df;->a(J)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/kuaishou/weapon/p0/cp$1;->a:Ljava/lang/String;

    sget-object v0, Lcom/kuaishou/weapon/p0/ck;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/kuaishou/weapon/p0/cp$1;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/kuaishou/weapon/p0/df;->a(Landroid/content/Context;)Lcom/kuaishou/weapon/p0/df;

    move-result-object p1

    const-string v0, "es_a1_1_upl_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lcom/kuaishou/weapon/p0/df;->a(Ljava/lang/String;J)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/kuaishou/weapon/p0/cp$1;->a:Ljava/lang/String;

    sget-object v0, Lcom/kuaishou/weapon/p0/ck;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/kuaishou/weapon/p0/cp$1;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/kuaishou/weapon/p0/df;->a(Landroid/content/Context;)Lcom/kuaishou/weapon/p0/df;

    move-result-object p1

    const-string v0, "apl_a1_1_upl_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lcom/kuaishou/weapon/p0/df;->a(Ljava/lang/String;J)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/kuaishou/weapon/p0/cp$1;->a:Ljava/lang/String;

    sget-object v0, Lcom/kuaishou/weapon/p0/ck;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 9
    iget-object p1, p0, Lcom/kuaishou/weapon/p0/cp$1;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/kuaishou/weapon/p0/df;->a(Landroid/content/Context;)Lcom/kuaishou/weapon/p0/df;

    move-result-object p1

    const-string v0, "cpgc_a1_1_upl_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lcom/kuaishou/weapon/p0/df;->a(Ljava/lang/String;J)V

    goto :goto_0

    .line 10
    :cond_3
    iget-object p1, p0, Lcom/kuaishou/weapon/p0/cp$1;->a:Ljava/lang/String;

    sget-object v0, Lcom/kuaishou/weapon/p0/ck;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 11
    iget-object p1, p0, Lcom/kuaishou/weapon/p0/cp$1;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/kuaishou/weapon/p0/df;->a(Landroid/content/Context;)Lcom/kuaishou/weapon/p0/df;

    move-result-object p1

    const-string v0, "act_a1_1_upl_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lcom/kuaishou/weapon/p0/df;->a(Ljava/lang/String;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_4
    :goto_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lcom/kuaishou/weapon/p0/cp$1;->c:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/kuaishou/weapon/p0/cp$1;->a:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    :cond_0
    return-void
.end method
