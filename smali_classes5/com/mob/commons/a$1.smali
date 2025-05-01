.class Lcom/mob/commons/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mob/commons/a;->a(Lcom/mob/commons/MobProduct;Lcom/mob/tools/utils/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/mob/commons/MobProduct;

.field final synthetic b:Lcom/mob/tools/utils/e;

.field final synthetic c:Lcom/mob/commons/a;


# direct methods
.method constructor <init>(Lcom/mob/commons/a;Lcom/mob/commons/MobProduct;Lcom/mob/tools/utils/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/mob/commons/a$1;->c:Lcom/mob/commons/a;

    iput-object p2, p0, Lcom/mob/commons/a$1;->a:Lcom/mob/commons/MobProduct;

    iput-object p3, p0, Lcom/mob/commons/a$1;->b:Lcom/mob/tools/utils/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 12

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/mob/commons/a$1;->c:Lcom/mob/commons/a;

    invoke-static {v1}, Lcom/mob/commons/a;->a(Lcom/mob/commons/a;)[B

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2
    :try_start_1
    iget-object v2, p0, Lcom/mob/commons/a$1;->c:Lcom/mob/commons/a;

    sget-object v3, Lcom/mob/commons/e;->a:Ljava/lang/String;

    invoke-static {v2, v3, p1}, Lcom/mob/commons/a;->a(Lcom/mob/commons/a;Ljava/lang/String;Lcom/mob/tools/utils/DH$DHResponse;)Ljava/lang/String;

    move-result-object v2

    .line 3
    iget-object v3, p0, Lcom/mob/commons/a$1;->c:Lcom/mob/commons/a;

    invoke-static {v3}, Lcom/mob/commons/a;->b(Lcom/mob/commons/a;)Ljava/util/HashMap;

    move-result-object v3

    .line 4
    iget-object v4, p0, Lcom/mob/commons/a$1;->c:Lcom/mob/commons/a;

    invoke-static {v4, v3, p1}, Lcom/mob/commons/a;->a(Lcom/mob/commons/a;Ljava/util/HashMap;Lcom/mob/tools/utils/DH$DHResponse;)Z

    move-result v4

    .line 5
    iget-object v5, p0, Lcom/mob/commons/a$1;->c:Lcom/mob/commons/a;

    invoke-static {v5}, Lcom/mob/commons/a;->c(Lcom/mob/commons/a;)Z

    move-result v5

    .line 6
    iget-object v6, p0, Lcom/mob/commons/a$1;->c:Lcom/mob/commons/a;

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-nez v4, :cond_1

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v9, 0x1

    :goto_1
    invoke-static {v6, v9}, Lcom/mob/commons/a;->a(Lcom/mob/commons/a;Z)Z

    .line 7
    iget-object v6, p0, Lcom/mob/commons/a$1;->c:Lcom/mob/commons/a;

    iget-object v9, p0, Lcom/mob/commons/a$1;->a:Lcom/mob/commons/MobProduct;

    invoke-static {v6, v3, v9, p1}, Lcom/mob/commons/a;->a(Lcom/mob/commons/a;Ljava/util/HashMap;Lcom/mob/commons/MobProduct;Lcom/mob/tools/utils/DH$DHResponse;)Z

    move-result v6

    .line 8
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "map: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, "\nisCh: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v11, ", isG: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, ", isReg: "

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v8, v8, [Ljava/lang/Object;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, ", udif:"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, p0, Lcom/mob/commons/a$1;->c:Lcom/mob/commons/a;

    invoke-static {v11}, Lcom/mob/commons/a;->d(Lcom/mob/commons/a;)Z

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v7

    invoke-virtual {v9, v5, v8}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 9
    iget-object v5, p0, Lcom/mob/commons/a$1;->c:Lcom/mob/commons/a;

    invoke-static {v5}, Lcom/mob/commons/a;->d(Lcom/mob/commons/a;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 10
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    sget-object v2, Lcom/mob/commons/e;->a:Ljava/lang/String;

    .line 11
    :cond_2
    iget-object v5, p0, Lcom/mob/commons/a$1;->c:Lcom/mob/commons/a;

    invoke-static {v5, v3, v2, p1}, Lcom/mob/commons/a;->a(Lcom/mob/commons/a;Ljava/util/HashMap;Ljava/lang/String;Lcom/mob/tools/utils/DH$DHResponse;)V

    :cond_3
    if-nez v4, :cond_4

    if-eqz v6, :cond_5

    .line 12
    :cond_4
    iget-object p1, p0, Lcom/mob/commons/a$1;->c:Lcom/mob/commons/a;

    invoke-static {p1, v3}, Lcom/mob/commons/a;->a(Lcom/mob/commons/a;Ljava/util/HashMap;)V

    .line 13
    :cond_5
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    iget-object p1, p0, Lcom/mob/commons/a$1;->b:Lcom/mob/tools/utils/e;

    invoke-virtual {p1, v0}, Lcom/mob/tools/utils/e;->a(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    .line 15
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 16
    iget-object v1, p0, Lcom/mob/commons/a$1;->b:Lcom/mob/tools/utils/e;

    invoke-virtual {v1, v0}, Lcom/mob/tools/utils/e;->a(Ljava/lang/Object;)V

    .line 17
    throw p1
.end method
