.class Lcom/mob/commons/a/g$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/mob/commons/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mob/commons/a/g;->n()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private volatile a:J


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/mob/commons/a/g$1;->a:J

    return-void
.end method


# virtual methods
.method public a(ZZJ)V
    .locals 10

    const/4 v0, 0x2

    const/4 v1, 0x3

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz p2, :cond_0

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iput-wide v6, p0, Lcom/mob/commons/a/g$1;->a:J

    .line 2
    new-instance v6, Lcom/mob/commons/a/g;

    invoke-direct {v6}, Lcom/mob/commons/a/g;-><init>()V

    new-array v7, v1, [Ljava/lang/Long;

    .line 3
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v7, v4

    iget-wide v8, p0, Lcom/mob/commons/a/g$1;->a:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v7, v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v7, v0

    invoke-virtual {v6, v7}, Lcom/mob/commons/a/c;->a(Ljava/lang/Object;)Lcom/mob/commons/a/c;

    move-result-object v7

    .line 4
    invoke-virtual {v7, v4}, Lcom/mob/commons/a/c;->b(Z)Lcom/mob/commons/a/c;

    move-result-object v7

    .line 5
    invoke-virtual {v7, v5}, Lcom/mob/commons/a/c;->a(Z)Lcom/mob/commons/a/c;

    .line 6
    invoke-static {}, Lcom/mob/commons/a/d;->a()Lcom/mob/commons/a/d;

    move-result-object v7

    invoke-virtual {v7, v6, v2, v3, v5}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;JI)V

    :cond_0
    if-eqz p1, :cond_1

    if-nez p2, :cond_2

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/mob/commons/a/g$1;->a:J

    .line 8
    new-instance p1, Lcom/mob/commons/a/g;

    invoke-direct {p1}, Lcom/mob/commons/a/g;-><init>()V

    new-array p2, v1, [Ljava/lang/Long;

    const-wide/16 p3, 0x1

    .line 9
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, p2, v4

    iget-wide p3, p0, Lcom/mob/commons/a/g$1;->a:J

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, p2, v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, p2, v0

    invoke-virtual {p1, p2}, Lcom/mob/commons/a/c;->a(Ljava/lang/Object;)Lcom/mob/commons/a/c;

    move-result-object p2

    .line 10
    invoke-virtual {p2, v4}, Lcom/mob/commons/a/c;->b(Z)Lcom/mob/commons/a/c;

    move-result-object p2

    .line 11
    invoke-virtual {p2, v5}, Lcom/mob/commons/a/c;->a(Z)Lcom/mob/commons/a/c;

    .line 12
    invoke-static {}, Lcom/mob/commons/a/d;->a()Lcom/mob/commons/a/d;

    move-result-object p2

    invoke-virtual {p2, p1, v2, v3, v4}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;JI)V

    goto :goto_0

    :cond_1
    cmp-long p1, p3, v2

    if-lez p1, :cond_2

    .line 13
    new-instance p1, Lcom/mob/commons/a/g;

    invoke-direct {p1}, Lcom/mob/commons/a/g;-><init>()V

    new-array p2, v1, [Ljava/lang/Long;

    const-wide/16 p3, 0x2

    .line 14
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, p2, v4

    iget-wide p3, p0, Lcom/mob/commons/a/g$1;->a:J

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, p2, v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, p2, v0

    invoke-virtual {p1, p2}, Lcom/mob/commons/a/c;->a(Ljava/lang/Object;)Lcom/mob/commons/a/c;

    move-result-object p2

    invoke-virtual {p2, v4}, Lcom/mob/commons/a/c;->b(Z)Lcom/mob/commons/a/c;

    move-result-object p2

    .line 15
    invoke-virtual {p2, v5}, Lcom/mob/commons/a/c;->a(Z)Lcom/mob/commons/a/c;

    .line 16
    invoke-static {}, Lcom/mob/commons/a/d;->a()Lcom/mob/commons/a/d;

    move-result-object p2

    invoke-virtual {p2, p1, v2, v3, v5}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;JI)V

    :cond_2
    :goto_0
    return-void
.end method
